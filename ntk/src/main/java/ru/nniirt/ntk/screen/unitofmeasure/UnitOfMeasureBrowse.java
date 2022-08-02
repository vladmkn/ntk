package ru.nniirt.ntk.screen.unitofmeasure;

import io.jmix.ui.screen.*;
import ru.nniirt.ntk.entity.UnitOfMeasure;

@UiController("ntk_UnitOfMeasure.browse")
@UiDescriptor("unit-of-measure-browse.xml")
@LookupComponent("unitOfMeasuresTable")
public class UnitOfMeasureBrowse extends StandardLookup<UnitOfMeasure> {
}