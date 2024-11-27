package net.bettercombat.client;

import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;

import java.util.List;

public class BetterCombatKeybindings {
    public static KeyBinding feintKeyBinding;
    public static KeyBinding toggleMineKeyBinding;
    public static KeyBinding toggleStrongAttackKeyBinding;
    public static List<KeyBinding> all;

    static {
        feintKeyBinding = new KeyBinding(
                "keybinds.bettercombat.feint",
                InputUtil.Type.KEYSYM,
                InputUtil.UNKNOWN_KEY.getCode(),
                "Better Combat");

        toggleMineKeyBinding = new KeyBinding(
                "keybinds.bettercombat.toggle_mine_with_weapons",
                InputUtil.Type.KEYSYM,
                InputUtil.UNKNOWN_KEY.getCode(),
                "Better Combat");

        toggleStrongAttackKeyBinding = new KeyBinding(
                "keybinds.bettercombat.toggle_strong_attack",
                InputUtil.Type.KEYSYM,
                InputUtil.UNKNOWN_KEY.getCode(),
                "Better Combat");

        all = List.of(feintKeyBinding, toggleMineKeyBinding, toggleStrongAttackKeyBinding);
    }
}
