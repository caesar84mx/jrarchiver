package com.caesar_84.jrarchiver.command;

import com.caesar_84.jrarchiver.ConsoleHelper;

public class ExitCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
