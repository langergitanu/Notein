package com.aspose.words;

import com.aspose.slides.C22218Oooo;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzYEJ implements zzZCY, Cloneable {
    int zzQy;
    int zzXqj;
    int zzXqk;
    int zzXql;
    int zzZGm;
    private zzYEH zzXqi = new zzYEH();
    private zzYEH zzXqh = new zzYEH();

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private String zzYe8() {
        int length;
        if (this.zzXqh.getText().length() <= 30 && this.zzXqi.getText().length() <= 30) {
            return "";
        }
        String text = this.zzXqi.getText();
        String text2 = this.zzXqh.getText();
        if (this.zzXqh.getText().length() > 30) {
            int length2 = this.zzXqh.getText().length() - 30;
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(text);
            sbOooO0OO.append(this.zzXqh.getText().substring(0, length2));
            text = sbOooO0OO.toString();
            length = length2;
            text2 = this.zzXqh.getText().substring(length2);
        } else {
            length = 0;
        }
        if (text.length() > 30) {
            length = text.length() - 30;
        }
        String strSubstring = text.substring(0, length);
        String strSubstring2 = text.substring(length);
        zzYEI zzyei = new zzYEI();
        zzyei.zzZAL = strSubstring2;
        zzyei.zzXqg = this.zzXqi.zzYe5().zzXqg;
        zzYEI zzyei2 = new zzYEI();
        zzyei2.zzZAL = text2;
        zzyei2.zzXqg = this.zzXqh.zzYe5().zzXqg;
        this.zzXqi.clear();
        this.zzXqh.clear();
        this.zzXqi.zzZ(zzyei);
        this.zzXqh.zzZ(zzyei2);
        return strSubstring;
    }

    private zzYEJ zzYe9() {
        zzYEJ zzyej = (zzYEJ) memberwiseClone();
        zzyej.zzXqi = this.zzXqi.zzYe4();
        zzyej.zzXqh = this.zzXqh.zzYe4();
        return zzyej;
    }

    @Override // com.aspose.words.zzZCY
    public zzZCY deepCloneComplexAttr() {
        return zzYe9();
    }

    public final String getText() {
        return com.aspose.words.internal.zzZKN.format("{0}({1})", this.zzXqh.getText(), this.zzXqi.getText());
    }

    public int hashCode() {
        int iHashCode = (((((((this.zzZGm * 397) ^ this.zzXql) * 397) ^ this.zzXqk) * 397) ^ this.zzXqj) * 397) ^ this.zzQy;
        Iterator<zzYEI> it = this.zzXqi.iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 397) ^ it.next().hashCode();
        }
        Iterator<zzYEI> it2 = this.zzXqh.iterator();
        while (it2.hasNext()) {
            iHashCode = (iHashCode * 397) ^ it2.next().hashCode();
        }
        return iHashCode;
    }

    @Override // com.aspose.words.zzZCY
    public boolean isInheritedComplexAttr() {
        return false;
    }

    public final void zzD(Run run) {
        String strZzYe8 = zzYe8();
        if (strZzYe8.length() > 0) {
            Run run2 = new Run(run.getDocument(), strZzYe8, (zzYEF) run.zzZYh().zzbn());
            run2.zzZYh().remove(885);
            run.zzYC(run2);
        }
        if (this.zzXqi.getText().contains("EQ")) {
            for (Node node : zzYEG.zzB(run)) {
                run.zzYC(node);
            }
            run.remove();
        }
    }

    public final zzYEH zzYe6() {
        return this.zzXqh;
    }

    public final zzYEH zzYe7() {
        return this.zzXqi;
    }
}
