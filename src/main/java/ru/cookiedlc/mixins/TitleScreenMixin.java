package ru.cookiedlc.mixins;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;

// NOTE: this used to swap the vanilla title screen for a custom
// ru.cookiedlc.ui.mainscreen.CustomTitleScreen, but that class was
// missing from the source dump. Disabled for now — falls back to the
// stock Minecraft title screen. Re-enable once CustomTitleScreen exists.
@Mixin(TitleScreen.class)
public abstract class TitleScreenMixin extends Screen {

    protected TitleScreenMixin(Text title) {
        super(title);
    }
}