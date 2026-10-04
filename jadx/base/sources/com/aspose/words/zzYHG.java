package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHG {
    private zzYEM zzXwl;

    public zzYHG(zzYEM zzyem) {
        this.zzXwl = zzyem;
    }

    public final void zzRp(boolean z) throws Exception {
        this.zzXwl.zzYfW().zzYj3();
        if (!z) {
            this.zzXwl.zzYfW().zzCC("\\fldrslt");
            this.zzXwl.zzYfW().zzYj3();
        }
        this.zzXwl.zzYfW().zzYj3();
    }

    public final void zzS(FormField formField) throws Exception {
        zzYHZ zzyhzZzYfW = this.zzXwl.zzYfW();
        zzZMM zzzmmZzZ6O = formField.zzZ6O();
        boolean zZzXk = com.aspose.words.internal.zzZYD.zzXk(zzzmmZzZ6O.getTextInputDefault());
        if (zZzXk) {
            zzyhzZzYfW.zzYj5();
            this.zzXwl.zzYel().zzw(zzZ7R.zzZ(formField, 1));
        }
        zzyhzZzYfW.zzCC("\\*\\formfield");
        zzyhzZzYfW.zzZ5("\\fftype", formField.zzZ6R());
        zzyhzZzYfW.zz7("\\ffownhelp", zzzmmZzZ6O.zzZ6M());
        zzyhzZzYfW.zz7("\\ffownstat", zzzmmZzZ6O.zzZ6L());
        zzyhzZzYfW.zz7("\\ffprot", !zzzmmZzZ6O.getEnabled());
        zzyhzZzYfW.zz7("\\ffrecalc", zzzmmZzZ6O.zzZ6N());
        zzyhzZzYfW.zzY6("\\*\\ffname", zzzmmZzZ6O.getName());
        zzyhzZzYfW.zzY6("\\*\\ffhelptext", zzzmmZzZ6O.getHelpText());
        zzyhzZzYfW.zzY6("\\*\\ffstattext", zzzmmZzZ6O.getStatusText());
        zzyhzZzYfW.zzY6("\\*\\ffentrymcr", zzzmmZzZ6O.getEntryMacro());
        zzyhzZzYfW.zzY6("\\*\\ffexitmcr", zzzmmZzZ6O.getExitMacro());
        zzyhzZzYfW.zzZ5("\\ffres", zzZRB.zzZ(zzzmmZzZ6O, formField.zzZ6R()));
        int type = formField.getType();
        if (type == 70) {
            zzyhzZzYfW.zzZ5("\\fftypetxt", zzzmmZzZ6O.getTextInputType());
            zzyhzZzYfW.zzZ5("\\ffmaxlen", zzzmmZzZ6O.zzZ6K());
            zzyhzZzYfW.zzY6("\\*\\ffdeftext", zzzmmZzZ6O.getTextInputDefault());
            zzyhzZzYfW.zzY6("\\*\\ffformat", zzzmmZzZ6O.getTextInputFormat());
        } else if (type == 71) {
            zzyhzZzYfW.zz7("\\ffsize1", !zzzmmZzZ6O.zzZ6J());
            zzyhzZzYfW.zzZ5("\\ffhps", zzzmmZzZ6O.zzZ6I());
            zzyhzZzYfW.zzZ5("\\ffdefres", zzzmmZzZ6O.zzZ6H() ? 1 : 0);
        } else {
            if (type != 83) {
                throw new IllegalStateException("Unknown form field type.");
            }
            if (zzzmmZzZ6O.getDropDownItems().getCount() > 0) {
                zzyhzZzYfW.zzCD("\\ffhaslistbox");
                zzyhzZzYfW.zzZ5("\\ffdefres", zzzmmZzZ6O.zzZ6F());
                for (int i = 0; i < zzzmmZzZ6O.getDropDownItems().getCount(); i++) {
                    zzyhzZzYfW.zzY6("\\*\\ffl", zzzmmZzZ6O.getDropDownItems().get(i));
                }
            }
        }
        zzyhzZzYfW.zzYj3();
        if (zZzXk) {
            zzyhzZzYfW.zzYj4();
        }
    }

    public final void zzYiH() throws Exception {
        this.zzXwl.zzYfW().zzYj3();
        this.zzXwl.zzYfW().zzCC("\\fldrslt");
    }

    public final void zzZ(String str, zzYEF zzyef, boolean z) throws Exception {
        zzy(z, false);
        this.zzXwl.zzYfW().zzYj5();
        this.zzXwl.zzYel().zzW(zzyef, true);
        this.zzXwl.zzYfW().zzYV(str);
        this.zzXwl.zzYfW().zzYj4();
    }

    public final void zzy(boolean z, boolean z2) throws Exception {
        this.zzXwl.zzYfW().zzCC("\\field");
        this.zzXwl.zzYfW().zz7("\\fldlock", z);
        this.zzXwl.zzYfW().zz7("\\flddirty", z2);
        this.zzXwl.zzYfW().zzCC("\\*\\fldinst");
    }
}
