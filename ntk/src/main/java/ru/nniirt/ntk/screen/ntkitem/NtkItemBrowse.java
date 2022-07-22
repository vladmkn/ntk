package ru.nniirt.ntk.screen.ntkitem;

import io.jmix.ui.screen.*;
import ru.nniirt.ntk.entity.NtkItem;

@UiController("ntk_NtkItem.browse")
@UiDescriptor("ntk-item-browse.xml")
@LookupComponent("ntkItemsTable")
public class NtkItemBrowse extends StandardLookup<NtkItem> {
}