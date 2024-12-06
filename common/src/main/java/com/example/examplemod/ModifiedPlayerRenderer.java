package com.example.examplemod;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.state.PlayerRenderState;

public class ModifiedPlayerRenderer extends PlayerRenderer {
    public ModifiedPlayerRenderer(
        EntityRendererProvider.Context pContext, boolean pUseSlimModel)
    {
        super(pContext, pUseSlimModel);
    }

    @Override
    public void render(PlayerRenderState state, PoseStack stack, MultiBufferSource buffer, int light) {
        super.render(state, stack, buffer, light);
    }
}
