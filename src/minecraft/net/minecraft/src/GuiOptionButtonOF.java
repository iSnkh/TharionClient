package net.minecraft.src;

import net.minecraft.client.gui.GuiOptionButton;
import net.minecraft.client.settings.GameSettings;

public class GuiOptionButtonOF extends GuiOptionButton implements IOptionControl
{
    public GameSettings.Options option = null;

    public GuiOptionButtonOF(int id, int x, int y, GameSettings.Options option, String text)
    {
        super(id, x, y, option, text);
        this.option = option;
    }

    public GameSettings.Options getOption()
    {
        return this.option;
    }
}
