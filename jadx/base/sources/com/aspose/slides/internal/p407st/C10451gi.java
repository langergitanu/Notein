package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.words.EditingLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.gi */
/* JADX INFO: loaded from: classes4.dex */
public class C10451gi extends AbstractC10376bv {

    /* JADX INFO: renamed from: x1 */
    private static final int[] f37018x1 = {61442, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: k4 */
    private C10602qb f37019k4 = null;

    public C10451gi() {
        m51409um().m51917k4(EditingLanguage.FRENCH_FRANCE);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        int position = (int) (c3134k4.m13371ck().getPosition() + ((long) m51409um().m51914du()));
        C10602qb c10602qb = (C10602qb) C7019kk.m27452k4((Object) C10576og.m51429k4(c3134k4), C10602qb.class);
        if (c10602qb == null) {
            throw new Exception("First Escher record is not DgContainer.");
        }
        m50513yj().addItem(c10602qb);
        if (c3134k4.m13371ck().getPosition() < position) {
            throw new Exception("Probably DrawingContainer contains more DgContainer records.");
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv
    /* JADX INFO: renamed from: kk */
    public int[] mo50413kk() {
        return f37018x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10602qb m50827x1() {
        C10602qb c10602qb = this.f37019k4;
        if (c10602qb != null) {
            return c10602qb;
        }
        C10602qb c10602qb2 = (C10602qb) m50508kk(61442);
        this.f37019k4 = c10602qb2;
        return c10602qb2;
    }
}
