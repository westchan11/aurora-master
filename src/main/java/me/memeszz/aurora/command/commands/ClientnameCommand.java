package me.memeszz.aurora.command.commands;

import me.memeszz.aurora.Aurora;
import me.memeszz.aurora.command.Command;
import org.lwjgl.opengl.Display;

public class ClientnameCommand extends Command {
    @Override
    public String[] getAlias() {
        return new String[]{
                "name", "modname", "clientname", "suffix", "watermark"
        };
    }

    @Override
    public String getSyntax() {
        return "name <new name>";
    }

    @Override
    public void onCommand(String command, String[] args) throws Exception {
        if(!args[0].replace("__", " ").equalsIgnoreCase("")) {
            Aurora.MODNAME = args[0].replace("__", " ");
            Display.setTitle(Aurora.MODNAME + " " + Aurora.MODVER);
            sendClientMessage("set client name to " + args[0].replace("__", " "));
        }else
            sendClientMessage(getSyntax());
    }
}
