package ru.nniirt.ntk.screen.componentcatalogitem;

import io.jmix.ui.screen.*;
import ru.nniirt.ntk.entity.ComponentCatalogItem;

@UiController("ntk_ComponentCatalogItem.browse")
@UiDescriptor("component-catalog-item-browse.xml")
@LookupComponent("componentCatalogItemsTable")
public class ComponentCatalogItemBrowse extends StandardLookup<ComponentCatalogItem> {
}