package com.ytdd9527.networksexpansion.utils;

import com.ytdd9527.networksexpansion.api.groups.MainItemGroup;
import com.ytdd9527.networksexpansion.api.groups.SubFlexItemGroup;
import io.github.sefiraat.networks.Networks;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import javax.annotation.Nonnull;

/**
 * @author Final_ROOT
 * @since 2.0
 */
@UtilityClass
public class GroupConfigUtil {

    public static MainItemGroup getMainItemGroup(@Nonnull String key, @Nonnull Material defaultMaterial, @Nonnull String defaultName) {
        CustomItemStack customItemStack = new CustomItemStack(defaultMaterial, defaultName);
        NamespacedKey namespacedKey = new NamespacedKey(Networks.getInstance(), key);
        return new MainItemGroup(namespacedKey, customItemStack, 0);
    }

    public static SubFlexItemGroup getSubFlexItemGroup(@Nonnull String key, @Nonnull Material defaultMaterial, @Nonnull String defaultName) {
        CustomItemStack customItemStack = new CustomItemStack(defaultMaterial, defaultName);
        NamespacedKey namespacedKey = new NamespacedKey(Networks.getInstance(), key);
        return new SubFlexItemGroup(namespacedKey, customItemStack, 0);
    }

}
