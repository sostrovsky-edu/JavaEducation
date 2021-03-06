package design_pattern.behavioral.chain_of_responsibility.chain_of_responsibility.example1.type;

import design_pattern.behavioral.chain_of_responsibility.example1.logger.Logger;

public class FileLogger extends Logger {
    public FileLogger(int priority) {
        super(priority);
    }

    @Override
    protected void write(String message) {
        System.out.println("FileLogger: " +message);
    }
}
