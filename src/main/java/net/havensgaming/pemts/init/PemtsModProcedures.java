
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.havensgaming.pemts.init;

import net.havensgaming.pemts.procedures.ShineypemtOnEntityTickUpdateProcedure;
import net.havensgaming.pemts.procedures.ShineyconversionProcedure;
import net.havensgaming.pemts.procedures.SaucedProcedure;
import net.havensgaming.pemts.procedures.NoairProcedure;
import net.havensgaming.pemts.procedures.MaskcheckProcedure;
import net.havensgaming.pemts.procedures.MaowEntityDiesProcedure;
import net.havensgaming.pemts.procedures.LhmaskRightclickedProcedure;
import net.havensgaming.pemts.procedures.BaitOnBlockRightClickedProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class PemtsModProcedures {
	public static void load() {
		new ShineypemtOnEntityTickUpdateProcedure();
		new SaucedProcedure();
		new ShineyconversionProcedure();
		new BaitOnBlockRightClickedProcedure();
		new LhmaskRightclickedProcedure();
		new MaowEntityDiesProcedure();
		new MaskcheckProcedure();
		new NoairProcedure();
	}
}
