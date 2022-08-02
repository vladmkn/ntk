package ru.nniirt.ntk.screen.unitofmeasure;

import io.jmix.ui.screen.*;
import ru.nniirt.ntk.entity.UnitOfMeasure;

@UiController("ntk_UnitOfMeasure.edit")
@UiDescriptor("unit-of-measure-edit.xml")
@EditedEntityContainer("unitOfMeasureDc")
public class UnitOfMeasureEdit extends StandardEditor<UnitOfMeasure> {
}