package com.aspose.words;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class FieldDocVariable extends Field {
    private static boolean zzZ(VariableCollection variableCollection) {
        if (variableCollection.getCount() == 0) {
            return false;
        }
        Iterator<Map.Entry<String, String>> it = variableCollection.iterator();
        while (it.hasNext()) {
            if (!com.aspose.words.internal.zzZKN.zzU3(it.next().getValue())) {
                return true;
            }
        }
        return false;
    }

    public String getVariableName() {
        return zzZgq().zzDG(0);
    }

    public void setVariableName(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() {
        if (!com.aspose.words.internal.zzZYD.zzXk(getVariableName())) {
            return new zzZP2(this, "Error! Document Variable not defined.");
        }
        Document documentZzYBb = getStart().zzYBb();
        String str = documentZzYBb.getVariables().get(getVariableName());
        if (com.aspose.words.internal.zzZKN.zzU3(str)) {
            if (zzZ(documentZzYBb.getVariables())) {
                return new zzZP2(this, "Error! No document variable supplied.");
            }
            str = "";
        }
        return new zzZP5(this, str);
    }
}
