package smbarbour.mods.shared;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public class BCInteract
{
	public static int addToPipe(World worldObj, int xCoord, int yCoord, int zCoord, ForgeDirection unknown, ItemStack stackInSlot) {
		return 0;
	}

	public static boolean isHoldingPipe(EntityPlayer player) {
		return (player.getCurrentEquippedItem().getItem() instanceof IItemPipe);
	}
}
