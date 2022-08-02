package ru.nniirt.ntk.screen.ntkbomitem;

import io.jmix.ui.screen.*;
import ru.nniirt.ntk.entity.NtkBOMItem;

@UiController("ntk_NtkBOMItem.edit")
@UiDescriptor("ntk-bom-item-edit.xml")
@EditedEntityContainer("ntkBOMItemDc")
public class NtkBOMItemEdit extends StandardEditor<NtkBOMItem> {
}