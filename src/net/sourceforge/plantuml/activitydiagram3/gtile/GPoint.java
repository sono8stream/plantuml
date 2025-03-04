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
package net.sourceforge.plantuml.activitydiagram3.gtile;

import java.awt.geom.Point2D;

import net.sourceforge.plantuml.activitydiagram3.LinkRendering;
import net.sourceforge.plantuml.ugraphic.UTranslate;

public class GPoint {

	public static final String NORTH = "NORTH";
	public static final String SOUTH = "SOUTH";
	public static final String WEST = "WEST";
	public static final String EAST = "EAST";

	private final Gtile gtile;
	private final String name;
	private final LinkRendering linkRendering;

	public GPoint(Gtile gtile, String name, LinkRendering linkRendering) {
		this.gtile = gtile;
		this.name = name;
		this.linkRendering = linkRendering;
	}

	public GPoint(Gtile gtile, String name) {
		this(gtile, name, LinkRendering.none());
	}

	public Gtile getGtile() {
		return gtile;
	}

	public String getName() {
		return name;
	}

	public UTranslate getCoord() {
		return gtile.getCoord(name);
	}

	public Point2D getPoint2D() {
		return getCoord().getPosition();
	}

	public LinkRendering getLinkRendering() {
		return linkRendering;
	}

}
