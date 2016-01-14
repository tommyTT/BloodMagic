package WayofTime.bloodmagic.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import WayofTime.bloodmagic.api.Constants;
import WayofTime.bloodmagic.tile.container.ContainerItemRoutingNode;

@SideOnly(Side.CLIENT)
public class GuiItemRoutingNode extends GuiContainer
{
    public GuiItemRoutingNode(InventoryPlayer playerInventory, IInventory tileRoutingNode)
    {
        super(new ContainerItemRoutingNode(playerInventory, tileRoutingNode));
        this.xSize = 176;
        this.ySize = 169;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
//        this.fontRendererObj.drawString(TextHelper.localize("tile.BloodMagic.soulForge.name"), 8, 5, 4210752);
//        this.fontRendererObj.drawString(TextHelper.localize("container.inventory"), 8, 111, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        ResourceLocation soulForgeGuiTextures = new ResourceLocation(Constants.Mod.MODID + ":textures/gui/routingNode.png");
        this.mc.getTextureManager().bindTexture(soulForgeGuiTextures);
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);
    }
}