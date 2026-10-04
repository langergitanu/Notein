package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ1I {
    private boolean zzY2M;
    private Map<Node, Field> zzY2N;
    private zzZ1H zzY2O;
    private zzYE2 zzYQL;
    private boolean zzYlY;
    private boolean zzYmj;
    private boolean zzYt6;

    public zzZ1I(Document document, boolean z, boolean z2, boolean z3, zzYE2 zzye2, zzZ1H zzz1h) {
        this.zzYlY = z;
        this.zzYmj = z2;
        this.zzYt6 = z3;
        this.zzYQL = zzye2;
        this.zzY2O = zzz1h;
        this.zzY2N = zzZQF.zzZR(document);
    }

    public final boolean zz4(Field field) {
        field.getType();
        if (this.zzYmj) {
            return false;
        }
        for (Node node : field.zzZgH()) {
            if (node.getNodeType() == 5 || node.getNodeType() == 6 || node.getNodeType() == 7) {
                return false;
            }
        }
        return true;
    }

    public final boolean zz5(Field field) {
        int type = field.getType();
        if (type != 6 && type != 57) {
            if (type == 70) {
                return zz4(field);
            }
            if (type == 37) {
                return this.zzY2M && !this.zzYlY;
            }
            if (type != 38) {
                return false;
            }
        }
        return true;
    }

    public final void zzK(FieldStart fieldStart) throws Exception {
        Field field = (Field) com.aspose.words.internal.zzQW.zzZ((Map<FieldStart, TValue>) this.zzY2N, fieldStart);
        if (field != null) {
            zzb(field);
        }
    }

    public final boolean zzP(Run run) {
        FieldStart fieldStart;
        if (this.zzYlY || !this.zzY2M || (fieldStart = (FieldStart) com.aspose.words.internal.zzZKW.zzZ(run.getNextSibling(), FieldStart.class)) == null || fieldStart.getFieldType() != 37) {
            return false;
        }
        return com.aspose.words.internal.zzZYD.zzXh(run.getText());
    }

    public void zzU(FieldEnd fieldEnd) throws Exception {
        int fieldType = fieldEnd.getFieldType();
        if (fieldType != 3) {
            if (fieldType == 13) {
                this.zzY2M = false;
                return;
            } else if (fieldType != 72) {
                if (fieldType != 88) {
                    return;
                }
                this.zzY2O.zzZlN();
                return;
            }
        }
        if (this.zzYt6) {
            this.zzY2O.zzZlN();
        }
    }

    public abstract void zzU(FieldSeparator fieldSeparator) throws Exception;

    public abstract int zzW(FormField formField) throws Exception;

    public void zzb(Field field) throws Exception {
        int fieldType = field.getStart().getFieldType();
        if (fieldType == 3) {
            if (this.zzYt6) {
                FieldRef fieldRef = (FieldRef) field;
                this.zzY2O.zzP(fieldRef.getInsertHyperlink() ? com.aspose.words.internal.zzZKN.format("#{0}", fieldRef.getBookmarkName()) : com.aspose.words.internal.zzZKN.format("#{0}", "nowhere"), false, true);
                return;
            }
            return;
        }
        if (fieldType == 13) {
            this.zzY2M = true;
            return;
        }
        if (fieldType == 57) {
            this.zzYQL.zzZW(field);
            return;
        }
        if (fieldType == 72) {
            if (this.zzYt6) {
                FieldNoteRef fieldNoteRef = (FieldNoteRef) field;
                this.zzY2O.zzP(fieldNoteRef.getInsertHyperlink() ? com.aspose.words.internal.zzZKN.format("#{0}", fieldNoteRef.getBookmarkName()) : com.aspose.words.internal.zzZKN.format("#{0}", "nowhere"), false, true);
                return;
            }
            return;
        }
        if (fieldType == 88) {
            FieldHyperlink fieldHyperlink = (FieldHyperlink) field;
            this.zzY2O.zzZ(fieldHyperlink.getHRef(), fieldHyperlink.getTarget(), fieldHyperlink.getScreenTip(), false, false);
            return;
        }
        if (fieldType == 50 || fieldType == 51) {
            this.zzYQL.zzZY(field);
            return;
        }
        switch (fieldType) {
            case 31:
            case 32:
                field.getStart().getField().update();
                break;
            case 33:
                if (!"1".equals(field.getResult())) {
                    field.setResult("1");
                }
                break;
            default:
                if (zzZPU.zzD9(field.getStart().getFieldType())) {
                    this.zzYQL.zzZV(field);
                }
                break;
        }
    }
}
