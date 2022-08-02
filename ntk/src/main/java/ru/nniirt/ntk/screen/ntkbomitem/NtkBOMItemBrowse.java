package ru.nniirt.ntk.screen.ntkbomitem;

import io.jmix.ui.screen.*;
import ru.nniirt.ntk.entity.NtkBOMItem;

@UiController("ntk_NtkBOMItem.browse")
@UiDescriptor("ntk-bom-item-browse.xml")
@LookupComponent("ntkBOMItemsTable")
public class NtkBOMItemBrowse extends StandardLookup<NtkBOMItem> {
}