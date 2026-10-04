package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldDate extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\h", "\\l", "\\s", "\\u");

    private int getCalendarType() {
        if (!getUseLunarCalendar()) {
            if (getUseSakaEraCalendar()) {
                return 3;
            }
            return getUseUmAlQuraCalendar() ? 4 : 0;
        }
        int fieldUpdateCultureSource = getStart().zzYBb().getFieldOptions().getFieldUpdateCultureSource();
        if (fieldUpdateCultureSource == 0) {
            return zzZej();
        }
        if (fieldUpdateCultureSource == 1) {
            return zzZek();
        }
        throw new IllegalArgumentException();
    }

    private int zzZej() {
        int iIntValue = com.aspose.words.internal.zzZNG.zzpZ().zzj9().intValue();
        int iZzZfz = zzZgq().zzZfz();
        if (com.aspose.words.internal.zzBZ.zzZY(iIntValue, 1)) {
            return 1;
        }
        if (com.aspose.words.internal.zzBZ.zzZY(iIntValue, 13)) {
            return 2;
        }
        if (!com.aspose.words.internal.zzBZ.zzZY(iIntValue, 9)) {
            return 0;
        }
        if (com.aspose.words.internal.zzBZ.zzZY(iZzZfz, 1)) {
            return 1;
        }
        return com.aspose.words.internal.zzBZ.zzZY(iZzZfz, 13) ? 2 : 0;
    }

    private int zzZek() {
        int iZzp6 = zzZgq().zzp6();
        int iZzZfz = zzZgq().zzZfz();
        if (!zzZgq().getBidi() && !com.aspose.words.internal.zzBZ.zzZY(iZzp6, 9)) {
            return 0;
        }
        if (com.aspose.words.internal.zzBZ.zzZY(iZzZfz, 1)) {
            return 1;
        }
        return com.aspose.words.internal.zzBZ.zzZY(iZzZfz, 13) ? 2 : 0;
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        return (iZzTP == 0 || iZzTP == 1 || iZzTP == 2 || iZzTP == 3) ? 1 : 0;
    }

    public boolean getUseLastFormat() {
        return zzZgq().zzMj("\\l");
    }

    public boolean getUseLunarCalendar() {
        return zzZgq().zzMj("\\h");
    }

    public boolean getUseSakaEraCalendar() {
        return zzZgq().zzMj("\\s");
    }

    public boolean getUseUmAlQuraCalendar() {
        return zzZgq().zzMj("\\u");
    }

    public void setUseLastFormat(boolean z) throws Exception {
        zzZgq().zzs("\\l", z);
    }

    public void setUseLunarCalendar(boolean z) throws Exception {
        zzZgq().zzs("\\h", z);
    }

    public void setUseSakaEraCalendar(boolean z) throws Exception {
        zzZgq().zzs("\\s", z);
    }

    public void setUseUmAlQuraCalendar(boolean z) throws Exception {
        zzZgq().zzs("\\u", z);
    }

    @Override // com.aspose.words.Field
    public final String zzZgA() {
        return com.aspose.words.internal.zzJB.zzH8();
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() {
        return new zzZP5(this, new zzKF(getStart().zzYBb().zzZqb(), getCalendarType()));
    }
}
