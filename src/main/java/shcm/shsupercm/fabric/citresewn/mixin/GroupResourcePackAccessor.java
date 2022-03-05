package shcm.shsupercm.fabric.citresewn.mixin;

import net.fabricmc.fabric.impl.resource.loader.GroupResourcePack;
import net.minecraft.resource.ResourcePack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import shcm.shsupercm.fabric.citresewn.pack.PackParser;

import java.util.List;

/**
 * Access for individual packs in a grouped resourcepack.<br>
 * Used by Fabric API to bundle all mods' resources into a single pack.
 * @see PackParser#forEachPack
 */
@Mixin(GroupResourcePack.class)
public interface GroupResourcePackAccessor {
    @Accessor
    List<ResourcePack> getPacks();
}
