package net.havensgaming.pemts.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmoff<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("pemts", "modelmoff"), "main");
	public final ModelPart h_mothhead;
	public final ModelPart torso;
	public final ModelPart mothleftwing;
	public final ModelPart mothrightwing;
	public final ModelPart leftarm;
	public final ModelPart rightarm4;

	public Modelmoff(ModelPart root) {
		this.h_mothhead = root.getChild("h_mothhead");
		this.torso = root.getChild("torso");
		this.mothleftwing = root.getChild("mothleftwing");
		this.mothrightwing = root.getChild("mothrightwing");
		this.leftarm = root.getChild("leftarm");
		this.rightarm4 = root.getChild("rightarm4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition h_mothhead = partdefinition.addOrReplaceChild("h_mothhead", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, -5.0F));
		PartDefinition cube_r1 = h_mothhead.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(46, 16).addBox(-2.0F, 0.0F, 0.0F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 22).addBox(5.0F, 0.0F, 0.0F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -2.0F, -2.0F, 1.1781F, 0.0F, 0.0F));
		PartDefinition cube_r2 = h_mothhead.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(8, 25).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 34).addBox(2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, -2.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition mothhead_r1 = h_mothhead.addOrReplaceChild("mothhead_r1", CubeListBuilder.create().texOffs(0, 9).addBox(-7.5F, -4.0F, 1.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 3.0F, -3.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition mothhead_r2 = h_mothhead.addOrReplaceChild("mothhead_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -4.0F, 1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 3.0F, -2.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(24, 48).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.0F, 0.0F));
		PartDefinition wormbody_r1 = torso.addOrReplaceChild("wormbody_r1", CubeListBuilder.create().texOffs(47, 43).addBox(-8.0F, -5.0F, 0.0F, 8.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, -7.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition wormbody_r2 = torso.addOrReplaceChild("wormbody_r2", CubeListBuilder.create().texOffs(52, 28).addBox(-5.5F, -2.0F, 0.0F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 2.0F, 7.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition wormbody_r3 = torso.addOrReplaceChild("wormbody_r3", CubeListBuilder.create().texOffs(0, 48).addBox(-6.0F, -3.0F, 0.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition mothleftwing = partdefinition.addOrReplaceChild("mothleftwing", CubeListBuilder.create(), PartPose.offset(1.0F, 13.0F, -3.0F));
		PartDefinition cube_r3 = mothleftwing.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(35, 0).addBox(-1.5F, 0.0F, 0.0F, 18.0F, 0.0F, 16.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 0.0F, -1.5F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r4 = mothleftwing.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 0).addBox(-1.5F, 0.0F, 0.0F, 18.0F, 0.0F, 16.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition mothrightwing = partdefinition.addOrReplaceChild("mothrightwing", CubeListBuilder.create(), PartPose.offset(-1.0F, 13.0F, -3.0F));
		PartDefinition cube_r5 = mothrightwing.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-16.5F, 0.0F, 0.0F, 18.0F, 0.0F, 16.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 0.0F, -1.5F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r6 = mothrightwing.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-16.5F, 0.0F, 0.0F, 18.0F, 0.0F, 16.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(2.0F, 18.0F, -2.0F));
		PartDefinition cube_r7 = leftarm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(8, 43).addBox(-3.0F, -2.0F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 3.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r8 = leftarm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(46, 54).addBox(-2.0F, -6.0F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 3.0F));
		PartDefinition cube_r9 = leftarm2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(10, 38).addBox(-3.0F, -2.0F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 4.0F, 1.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r10 = leftarm2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 36).addBox(-2.0F, -6.0F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 3.0F, 1.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition rightarm4 = partdefinition.addOrReplaceChild("rightarm4", CubeListBuilder.create(), PartPose.offset(-2.0F, 17.0F, 1.0F));
		PartDefinition cube_r11 = rightarm4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(10, 29).addBox(2.0F, -2.0F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r12 = rightarm4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 27).addBox(0.0F, -6.0F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition rightarm3 = rightarm4.addOrReplaceChild("rightarm3", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -3.0F));
		PartDefinition cube_r13 = rightarm3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(10, 18).addBox(2.0F, -2.0F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r14 = rightarm3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 18).addBox(0.0F, -6.0F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		h_mothhead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mothleftwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mothrightwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.mothrightwing.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.h_mothhead.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.h_mothhead.xRot = headPitch / (180F / (float) Math.PI);
		this.mothleftwing.zRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightarm4.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
