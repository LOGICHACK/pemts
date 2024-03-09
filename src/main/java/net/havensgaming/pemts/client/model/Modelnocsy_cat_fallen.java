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
public class Modelnocsy_cat_fallen<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("pemts", "modelnocsy_cat_fallen"), "main");
	public final ModelPart body;
	public final ModelPart h_head;
	public final ModelPart front_leg_left;
	public final ModelPart front_leg_right;
	public final ModelPart back_leg_left;
	public final ModelPart back_leg_right;
	public final ModelPart CONTROL_tail;

	public Modelnocsy_cat_fallen(ModelPart root) {
		this.body = root.getChild("body");
		this.h_head = root.getChild("h_head");
		this.front_leg_left = root.getChild("front_leg_left");
		this.front_leg_right = root.getChild("front_leg_right");
		this.back_leg_left = root.getChild("back_leg_left");
		this.back_leg_right = root.getChild("back_leg_right");
		this.CONTROL_tail = root.getChild("CONTROL_tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -1.9979F, -4.4171F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.5F, -1.9979F, -4.4171F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.1F)),
				PartPose.offset(0.0F, 17.7979F, -1.0829F));
		PartDefinition tag_name = body.addOrReplaceChild("tag_name", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0F, 0.0F));
		PartDefinition h_head = partdefinition.addOrReplaceChild("h_head",
				CubeListBuilder.create().texOffs(0, 15).addBox(-3.0F, -3.75F, -4.25F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.5F, -0.25F, -5.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.85F, -4.25F));
		PartDefinition cube_r1 = h_head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(6, 52).addBox(-6.4323F, 2.25F, -3.0F, 6.0F, 7.0F, 0.075F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5323F, -4.4746F, -2.163F, 0.0203F, 0.0051F, 0.0006F));
		PartDefinition h_ears = h_head.addOrReplaceChild("h_ears", CubeListBuilder.create(), PartPose.offsetAndRotation(0.028F, -2.5884F, -2.1135F, 0.2953F, -0.0341F, 0.0F));
		PartDefinition cube_r2 = h_ears.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(44, 44).addBox(-2.2F, -3.0F, 0.0F, 6.0F, 6.0F, 0.075F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5603F, -1.8863F, -0.0495F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r3 = h_ears.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(27, 45).addBox(-3.8F, -3.0F, 0.0F, 6.0F, 6.0F, 0.075F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5043F, -1.8863F, -0.0495F, 0.0F, 0.0F, 0.3927F));
		PartDefinition front_leg_left = partdefinition.addOrReplaceChild("front_leg_left",
				CubeListBuilder.create().texOffs(24, 29).addBox(-1.2F, -1.3521F, -1.2046F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.15F)).texOffs(3, 6).addBox(-1.2F, -1.3521F, -1.2046F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3F, 20.1F, -3.0F, -0.1744F, 0.0076F, 0.043F));
		PartDefinition front_foot_left = front_leg_left.addOrReplaceChild("front_foot_left", CubeListBuilder.create().texOffs(12, 36).addBox(-1.5F, -0.3106F, -1.3216F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3F, 2.3F, 0.1F, 0.1744F, 0.0076F, -0.043F));
		PartDefinition front_leg_right = partdefinition.addOrReplaceChild("front_leg_right",
				CubeListBuilder.create().texOffs(1, 7).addBox(-1.8F, -1.3521F, -1.2046F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 29).addBox(-1.8F, -1.3521F, -1.2046F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(-2.3F, 20.1F, -3.0F, -0.1744F, -0.0076F, -0.043F));
		PartDefinition front_foot_right = front_leg_right.addOrReplaceChild("front_foot_right", CubeListBuilder.create().texOffs(0, 35).addBox(-1.5F, -0.3106F, -1.3216F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3F, 2.3F, 0.1F, 0.1744F, -0.0076F, 0.043F));
		PartDefinition back_leg_left = partdefinition.addOrReplaceChild("back_leg_left", CubeListBuilder.create().texOffs(28, 17).addBox(-1.2F, -0.9521F, -1.2954F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.15F)).texOffs(1, 7).mirror()
				.addBox(-1.2F, -0.9521F, -1.2954F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3F, 18.725F, 2.4F, 0.1745F, 0.0F, 0.0F));
		PartDefinition back_foot_left = back_leg_left.addOrReplaceChild("back_foot_left", CubeListBuilder.create().texOffs(33, 33).addBox(-1.5F, -0.2506F, -1.8F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3F, 3.6506F, 0.4F, -0.1745F, 0.0F, 0.0F));
		PartDefinition back_leg_right = partdefinition.addOrReplaceChild("back_leg_right",
				CubeListBuilder.create().texOffs(0, 27).addBox(-1.8F, -0.9521F, -1.2954F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.15F)).texOffs(1, 7).addBox(-1.8F, -0.9521F, -1.2954F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3F, 18.725F, 2.4F, 0.1745F, 0.0F, 0.0F));
		PartDefinition back_foot_right = back_leg_right.addOrReplaceChild("back_foot_right", CubeListBuilder.create().texOffs(33, 26).addBox(-1.5F, -0.2506F, -1.8F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3F, 3.6506F, 0.4F, -0.1745F, 0.0F, 0.0F));
		PartDefinition CONTROL_tail = partdefinition.addOrReplaceChild("CONTROL_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 17.7979F, -1.0829F));
		PartDefinition tail = CONTROL_tail.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(20, 0).addBox(-1.5F, -1.3635F, -1.4751F, 3.0F, 3.0F, 6.0F, new CubeDeformation(-0.15F)).texOffs(3, 7).addBox(-1.5F, -1.4093F, 1.8837F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0021F, 5.3829F, 0.7941F, 0.0F, 0.0F));
		PartDefinition tail_half = tail.addOrReplaceChild("tail_half",
				CubeListBuilder.create().texOffs(18, 21).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.15F)).texOffs(1, 8).mirror().addBox(-1.5F, -1.5F, 2.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0907F, 4.3837F, 0.829F, 0.0F, 0.0F));
		PartDefinition tail_end = tail_half.addOrReplaceChild("tail_end", CubeListBuilder.create().texOffs(25, 10).addBox(-1.5F, -1.2F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(0.5F, 0.4F, 5.0F, 1.0912F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		h_head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_leg_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_leg_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_leg_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_leg_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		CONTROL_tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.back_leg_right.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.h_head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.h_head.xRot = headPitch / (180F / (float) Math.PI);
		this.back_leg_left.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.CONTROL_tail.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.front_leg_right.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.front_leg_left.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
