package ru.nniirt.ntk.screen.ntkitem;

import io.jmix.ui.screen.*;
import ru.nniirt.ntk.entity.NtkItem;

@UiController("ntk_NtkItem.edit")
@UiDescriptor("ntk-item-edit.xml")
@EditedEntityContainer("ntkItemDc")
public class NtkItemEdit extends StandardEditor<NtkItem> {
}