/*
 * Commons eID Project.
 * Copyright (C) 2008-2012 FedICT.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version
 * 3.0 as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, see 
 * http://www.gnu.org/licenses/.
 */

/**
 * Interface to subscribe to a TerminalManager
 * 
 * @author Frank Marien
 * 
 */

package be.fedict.commons.eid.client;
import javax.smartcardio.Card;
import javax.smartcardio.CardTerminal;


public interface TerminalManagerListener
{
	void terminalAttached(CardTerminal cardTerminal);
	void terminalDetached(CardTerminal cardTerminal);
	void cardInserted(CardTerminal cardTerminal, Card card);
	void cardRemoved(CardTerminal cardTerminal);
	void terminalException(Throwable throwable);
}
