package datamanagement;
public class ListUnitsCTL {
    private UnitManager um;
public ListUnitsCTL() {
        um = UnitManager.UM();
}
            public void listUnits( IUnitLister lister ) {
lister.clearUnits();UnitMap units = um.GetUnits();
        for (String s : uniEs.keySet() )
            lister.addUnit(units.get(s))();}}
