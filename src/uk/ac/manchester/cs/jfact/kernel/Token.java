package uk.ac.manchester.cs.jfact.kernel;

/* This file is part of the JFact DL reasoner
 Copyright 2011 by Ignazio Palmisano, Dmitry Tsarkov, University of Manchester
 This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation; either version 2.1 of the License, or (at your option) any later version. 
 This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 You should have received a copy of the GNU Lesser General Public License along with this library; if not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301 USA*/
import org.semanticweb.owlapi.reasoner.ReasonerInternalException;

public enum Token {
    AND("and"), OR("or"), NOT("not"), INV("inv"),
    /** role composition */
    RCOMPOSITION("compose"),
    /** role projection into */
    PROJINTO("project_into"),
    /** role projection from */
    PROJFROM("project_from"), SELF("self-ref"), TOP("*TOP*"), BOTTOM("*BOTTOM*"), EXISTS(
            "some"), FORALL("all"),
    /** ATLEAST = GE */
    GE(
            "at-least"),
    /** ATMOST = LE */
    LE("at-most"),
    // common metasymbols
    /** any data expression: data value, [constrained] datatype */
    DATAEXPR("dataexpr"),
    // more precise ID's discretion
    /** name of a concept */
    CNAME("cname"),
    /** name of a singleton */
    INAME("one-of"),
    /** name of a role */
    RNAME("rname"),
    /** name of a data role */
    DNAME("dname");
    // FaCT commands
    private String s;

    private Token(String s) {
        this.s = s;
    }

    public String getName() {
        if (s.length() > 0) {
            return s;
        }
        throw new ReasonerInternalException("token " + toString() + "has no name");
    }
}
