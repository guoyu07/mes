package com.qcadoo.mes.plugins.products.translation;

import java.util.Locale;
import java.util.Map;

import com.qcadoo.mes.core.data.definition.ViewDefinition;

public interface TranslationService {

    Map<String, String> getCommonsTranslations(Locale locale);

    void translateViewDefinition(ViewDefinition viewDefinition, Locale locale);

}
