/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * (C) Copyright 2009-2020, Arnaud Roques
 *
 * Project Info:  http://plantuml.com
 * 
 * If you like this project or if you find it useful, you can support us at:
 * 
 * http://plantuml.com/patreon (only 1$ per month!)
 * http://plantuml.com/paypal
 * 
 * This file is part of PlantUML.
 *
 * PlantUML is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PlantUML distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 *
 * Original Author:  Arnaud Roques
 * 
 *
 */
package net.sourceforge.plantuml.project3;

import java.util.List;

import net.sourceforge.plantuml.classdiagram.AbstractEntityDiagram;
import net.sourceforge.plantuml.command.CommandExecutionResult;
import net.sourceforge.plantuml.command.SingleLineCommand;

public class CommandPage extends SingleLineCommand<GanttDiagram> {

	public CommandPage() {
		super("(?i)^page[%s]+(\\d+)[%s]*x[%s]*(\\d+)$");
	}

	@Override
	protected CommandExecutionResult executeArg(GanttDiagram diagram, List<String> arg) {

		final int horizontal = Integer.parseInt(arg.get(0));
		final int vertical = Integer.parseInt(arg.get(1));
		if (horizontal <= 0 || vertical <= 0) {
			return CommandExecutionResult.error("Argument must be positive");
		}
		diagram.setHorizontalPages(horizontal);
		diagram.setVerticalPages(vertical);
		return CommandExecutionResult.ok();
	}

}
