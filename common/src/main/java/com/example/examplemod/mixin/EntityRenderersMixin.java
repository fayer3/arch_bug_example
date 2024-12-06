package com.example.examplemod.mixin;

import com.example.examplemod.ModifiedPlayerRenderer;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(EntityRenderers.class)
public class EntityRenderersMixin {
    @WrapOperation(method = {"method_32197", "method_32198"}, at = @At(value = "NEW", target = "net/minecraft/client/renderer/entity/player/PlayerRenderer"))
    private static PlayerRenderer modPlayerRender(
        EntityRendererProvider.Context pContext, boolean pUseSlimModel, Operation<PlayerRenderer> original) {
        return new ModifiedPlayerRenderer(pContext, pUseSlimModel);
    }
}
