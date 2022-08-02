package ru.nniirt.ntk.screen.componentcatalogitem;

import io.jmix.ui.screen.*;
import ru.nniirt.ntk.entity.ComponentCatalogItem;

@UiController("ntk_ComponentCatalogItem.edit")
@UiDescriptor("component-catalog-item-edit.xml")
@EditedEntityContainer("componentCatalogItemDc")
public class ComponentCatalogItemEdit extends StandardEditor<ComponentCatalogItem> {
}