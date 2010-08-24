/**
 * 
 */
package de.saumya.mojo.ruby;

import java.io.File;
import java.io.IOException;
import java.util.List;

interface Launcher {

    public abstract void execute(final List<String> args)
            throws RubyScriptException, IOException;

    public abstract void execute(final List<String> args, final File outputFile)
            throws RubyScriptException, IOException;

    public abstract void executeIn(final File launchDirectory,
            final List<String> args) throws RubyScriptException, IOException;

    public abstract void executeIn(final File launchDirectory,
            final List<String> args, final File outputFile)
            throws RubyScriptException, IOException;

    public abstract void executeScript(final String script,
            final List<String> args) throws RubyScriptException, IOException;

    public abstract void executeScript(final String script,
            final List<String> args, final File outputFile)
            throws RubyScriptException, IOException;

    public abstract void executeScript(final File launchDirectory,
            final String script, final List<String> args)
            throws RubyScriptException, IOException;

    public abstract void executeScript(final File launchDirectory,
            final String script, final List<String> args,
            final File outputFile) throws RubyScriptException, IOException;

}