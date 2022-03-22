package net.guizhanss.minecraft.networks;

import lombok.experimental.UtilityClass;
import net.guizhanss.guizhanlib.language.Boolean;

import javax.annotation.Nonnull;

@UtilityClass
public class BooleanUtil {
    public static @Nonnull String isEnabled(boolean bool) {
        return Boolean.enabledOrDisabled(bool);
    }
}
