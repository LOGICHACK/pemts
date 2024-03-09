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
public class Modelnocsy_fpv2_dog<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("pemts", "modelnocsy_fpv_2_dog"), "main");
	public final ModelPart chest;
	public final ModelPart leg_right;
	public final ModelPart leg_left;
	public final ModelPart h_head;

	public Modelnocsy_fpv2_dog(ModelPart root) {
		this.chest = root.getChild("chest");
		this.leg_right = root.getChild("leg_right");
		this.leg_left = root.getChild("leg_left");
		this.h_head = root.getChild("h_head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition chest = partdefinition.addOrReplaceChild("chest",
				CubeListBuilder.create().texOffs(22, 23).addBox(0.8901F, -1.88F, -2.8275F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(44, 32).addBox(3.8901F, -6.02F, -1.8275F, 0.0F, 4.44F, 5.12F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.8901F, 15.16F, 1.1075F));
		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 33).addBox(0.15F, -2.88F, -3.06F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 40).addBox(-0.15F, -2.88F, -3.06F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7802F, 1.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(14, 35).addBox(-1.96F, -0.92F, -4.42F, 4.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8501F, 1.0F, 5.3525F, -0.3927F, 0.0F, 0.0F));
		PartDefinition tail = chest.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(3.6181F, 1.634F, 6.1046F));
		PartDefinition cube_r4 = tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(48, 46).addBox(-1.2864F, -2.9147F, -0.7136F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0584F, 1.9531F, -0.6945F, 0.3927F, 0.0F, 0.0F));
		PartDefinition end_tail = tail.addOrReplaceChild("end_tail", CubeListBuilder.create().texOffs(0, 19).addBox(0.1088F, -10.2878F, -4.2212F, 0.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1632F, -0.9188F, 1.491F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r5 = end_tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 51).addBox(-1.572F, -0.5862F, -0.8635F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.1808F, -1.5582F, 0.6604F, -0.3927F, 0.0F, 0.0F));
		PartDefinition tag_name = chest.addOrReplaceChild("tag_name", CubeListBuilder.create(), PartPose.offset(3.8901F, -14.9308F, -3.8226F));
		PartDefinition leg_right = partdefinition.addOrReplaceChild("leg_right", CubeListBuilder.create().texOffs(56, 12).addBox(-0.6241F, -1.1664F, -0.7167F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.457F, 16.5331F, 4.4155F, -0.2661F, -0.203F, 1.0602F));
		PartDefinition right_tibia = leg_right.addOrReplaceChild("right_tibia", CubeListBuilder.create().texOffs(56, 27).addBox(-1.3487F, 1.3999F, -1.3575F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1186F, 3.3159F, 0.6844F, -0.0428F, 0.4487F, -1.0334F));
		PartDefinition cube_r6 = right_tibia.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 54).addBox(-2.4168F, -1.2339F, -1.6213F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition right_foot = right_tibia.addOrReplaceChild("right_foot", CubeListBuilder.create().texOffs(44, 31).addBox(-1.991F, 1.6213F, -1.6498F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)).texOffs(12, 52)
				.addBox(-0.9047F, 1.5713F, -0.5536F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 38).addBox(0.0953F, -1.4287F, 2.4464F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.44F, 2.5966F, -0.3281F));
		PartDefinition cube_r7 = right_foot.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(44, 9).addBox(2.9535F, -1.3001F, -4.9914F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0232F, 0.8714F, -3.9565F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r8 = right_foot.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(28, 44).addBox(-7.8375F, -1.3001F, -8.8754F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 58).addBox(-8.8375F, 0.6999F, -4.8754F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2968F, 0.8714F, -3.9565F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r9 = right_foot.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(58, 5).addBox(2.0466F, 0.6999F, -0.3625F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0408F, 0.8714F, -3.9565F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r10 = right_foot.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(46, 6).addBox(-2.0287F, -0.4632F, -2.2163F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0408F, 0.8714F, 0.1235F, 0.3927F, 0.0F, 0.0F));
		PartDefinition leg_left = partdefinition.addOrReplaceChild("leg_left", CubeListBuilder.create().texOffs(0, 0).addBox(-1.3759F, -1.1664F, -0.7167F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.457F, 16.5331F, 4.4155F, -0.2661F, 0.203F, -1.0602F));
		PartDefinition left_tibia = leg_left.addOrReplaceChild("left_tibia", CubeListBuilder.create().texOffs(56, 0).addBox(-0.6513F, 1.3999F, -1.3575F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1186F, 3.3159F, 0.6844F, -0.0428F, -0.4487F, 1.0334F));
		PartDefinition cube_r11 = left_tibia.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(51, 38).addBox(-0.5832F, -1.2339F, -1.6213F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition left_foot = left_tibia.addOrReplaceChild("left_foot", CubeListBuilder.create().texOffs(24, 0).addBox(-2.009F, 1.6213F, -1.6498F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)).texOffs(36, 50)
				.addBox(-1.0953F, 1.5713F, -0.5536F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 33).addBox(-0.0953F, -1.4287F, 2.4464F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.44F, 2.5966F, -0.3281F));
		PartDefinition cube_r12 = left_foot.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(28, 40).addBox(-2.9535F, -1.3001F, -4.9914F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0232F, 0.8714F, -3.9565F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r13 = left_foot.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(40, 40).addBox(7.8375F, -1.3001F, -8.8754F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 0).addBox(6.8375F, 0.6999F, -4.8754F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2968F, 0.8714F, -3.9565F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r14 = left_foot.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(56, 54).addBox(-4.0466F, 0.6999F, -0.3625F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0408F, 0.8714F, -3.9565F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r15 = left_foot.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(40, 0).addBox(-1.9713F, -0.4632F, -2.2163F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0408F, 0.8714F, 0.1235F, 0.3927F, 0.0F, 0.0F));
		PartDefinition h_head = partdefinition.addOrReplaceChild("h_head", CubeListBuilder.create().texOffs(28, 6).addBox(-3.0F, -0.3931F, -6.0174F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 13.2292F, -0.7152F, 0.1353F, 0.0F, 0.0F));
		PartDefinition cube_r16 = h_head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -6.533F, -6.7454F, 0.0F, 15.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.384F, -4.8825F, -0.3927F, 0.0F, 0.0F));
		PartDefinition h_jaw = h_head.addOrReplaceChild("h_jaw", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0865F, -8.1986F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.331F, -0.2749F, 0.5465F, 0.0F, 0.0F));
		PartDefinition cube_r17 = h_jaw.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(48, 50).addBox(0.3F, -2.1015F, -2.6451F, 0.0F, 5.12F, 4.72F, new CubeDeformation(0.0F)).texOffs(36, 52).addBox(5.82F, -2.1015F, -2.6451F, 0.0F, 5.12F, 4.72F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.06F, -0.5154F, -1.8748F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r18 = h_jaw.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(40, 21).addBox(-3.94F, -3.4638F, -1.5793F, 9.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.56F, -3.7499F, -7.5684F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r19 = h_jaw.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(28, 7).addBox(-0.9971F, -2.4226F, -4.6902F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.06F, -3.4699F, -3.5084F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r20 = h_jaw.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(28, 27).addBox(0.9971F, -2.4226F, -4.6902F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.06F, -3.4699F, -3.5084F, 0.0F, 0.0F, 0.3927F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		chest.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		h_head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leg_right.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.chest.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.h_head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.h_head.xRot = headPitch / (180F / (float) Math.PI);
		this.leg_left.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
