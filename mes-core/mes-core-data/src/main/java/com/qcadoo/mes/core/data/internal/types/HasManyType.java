package com.qcadoo.mes.core.data.internal.types;

import com.qcadoo.mes.core.data.definition.DataFieldDefinition;
import com.qcadoo.mes.core.data.definition.view.elements.grid.ListData;
import com.qcadoo.mes.core.data.types.FieldType;
import com.qcadoo.mes.core.data.validation.ValidationResults;

public class HasManyType implements FieldType {

    private final String entityName;

    private final String fieldName;

    public HasManyType(final String entityName, final String fieldName) {
        this.entityName = entityName;
        this.fieldName = fieldName;
    }

    public String getEntityName() {
        return entityName;
    }

    @Override
    public boolean isSearchable() {
        return false;
    }

    @Override
    public boolean isOrderable() {
        return false;
    }

    @Override
    public boolean isAggregable() {
        return false;
    }

    @Override
    public Class<?> getType() {
        return ListData.class;
    }

    @Override
    public Object toObject(final DataFieldDefinition fieldDefinition, final Object value,
            final ValidationResults validationResults) {

        return null;
    }

    @Override
    public String toString(final Object value) {
        return null;
    }

    public String getFieldName() {
        return fieldName;
    }

}
