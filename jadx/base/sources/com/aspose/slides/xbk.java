package com.aspose.slides;

import android.support.v4.media.session.PlaybackStateCompat;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.AbstractC10458gz;
import com.aspose.slides.internal.p407st.C10386c9;
import com.aspose.slides.internal.p407st.C10543mi;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10715xl;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: loaded from: classes3.dex */
class xbk {
    /* JADX INFO: renamed from: k4 */
    public static void m73300k4(GroupShape groupShape, AbstractC10458gz abstractC10458gz) {
        tbp tbpVar = new tbp();
        tbp tbpVar2 = new tbp();
        C1258im c1258im = new C1258im();
        tbp[] tbpVarArr = {tbpVar};
        tbp[] tbpVarArr2 = {tbpVar2};
        C1258im[] c1258imArr = {c1258im};
        m73301k4(abstractC10458gz, tbpVarArr, tbpVarArr2, c1258imArr);
        tbpVarArr[0].CloneTo(tbpVar);
        tbpVarArr2[0].CloneTo(tbpVar2);
        c1258imArr[0].CloneTo(c1258im);
        C10543mi c10543miMo50865x1 = abstractC10458gz.mo50865x1();
        tbp tbpVar3 = new tbp();
        if (c10543miMo50865x1 != null) {
            double dM51290kk = ((double) c10543miMo50865x1.m51290kk()) / 12700.0d;
            double dM51292to = ((double) c10543miMo50865x1.m51292to()) / 12700.0d;
            double dM51287du = ((double) c10543miMo50865x1.m51287du()) / 12700.0d;
            groupShape.m1647k4(new tbp(((double) c10543miMo50865x1.m51294x1()) / 12700.0d, dM51290kk));
            tbpVar3 = new tbp(dM51292to, dM51287du);
        } else {
            tbp tbpVar4 = tbp.f49088kk;
            groupShape.m1647k4(tbpVar4.Clone());
            tbpVar4.CloneTo(tbpVar3);
        }
        groupShape.m1648k4(tbpVar.Clone(), tbpVar2.Clone(), c1258im.Clone(), tbpVar3.Clone());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: k4 */
    public static void m73301k4(AbstractC10458gz abstractC10458gz, tbp[] tbpVarArr, tbp[] tbpVarArr2, C1258im[] c1258imArr) {
        int iMo50549to;
        int iMo50543du;
        int iMo50551x1;
        int iMo50547kk;
        ?? M52029du;
        ?? M52034h4;
        C10609qn c10609qn;
        C10715xl c10715xlMo50860dy = abstractC10458gz.mo50860dy();
        if (c10715xlMo50860dy != null) {
            iMo50551x1 = c10715xlMo50860dy.mo50551x1();
            iMo50547kk = c10715xlMo50860dy.mo50547kk();
            iMo50549to = c10715xlMo50860dy.mo50549to();
            iMo50543du = c10715xlMo50860dy.mo50543du();
        } else {
            C10386c9 c10386c9Mo50858c5 = abstractC10458gz.mo50858c5();
            int iMo50551x12 = c10386c9Mo50858c5.mo50551x1() * 3175;
            int iMo50547kk2 = c10386c9Mo50858c5.mo50547kk() * 3175;
            int iMo50549to2 = c10386c9Mo50858c5.mo50549to() * 3175;
            int iMo50543du2 = c10386c9Mo50858c5.mo50543du() * 3175;
            iMo50549to = (iMo50549to2 + (((iMo50551x12 ^ 1) & iMo50549to2) & 1)) >> 1;
            iMo50543du = (iMo50543du2 + (((iMo50547kk2 ^ 1) & iMo50543du2) & 1)) >> 1;
            iMo50551x1 = (iMo50551x12 + (iMo50551x12 & 1)) >> 1;
            iMo50547kk = (iMo50547kk2 + (iMo50547kk2 & 1)) >> 1;
        }
        if (abstractC10458gz.mo50864to() != null) {
            M52029du = abstractC10458gz.mo50864to().m52029du();
            M52034h4 = abstractC10458gz.mo50864to().m52034h4();
        } else {
            M52029du = -1;
            M52034h4 = -1;
        }
        float f = 0.0f;
        if (abstractC10458gz.mo50859du() != null && (c10609qn = (C10609qn) C7019kk.m27452k4((Object) abstractC10458gz.mo50859du().m51263x1().m50923k4(4), C10609qn.class)) != null) {
            long jM51597ar = (c10609qn.m51597ar() & 4294967295L) >> 16;
            long j = jM51597ar & 4294967295L;
            long j2 = jM51597ar & 4294967295L;
            if ((jM51597ar & PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) != 0) {
                j = (360 - ((((C18177fb.f54859s - j2) & 4294967295L) + 1) & 4294967295L)) & 4294967295L;
            }
            float f2 = ((int) j) % 360.0f;
            if (f2 < 0.0f) {
                f2 += 360.0f;
            }
            if ((f2 >= 45.0f && f2 < 135.0f) || (f2 >= 225.0f && f2 < 315.0f)) {
                int i = ((iMo50549to & 1) + iMo50549to) >> 1;
                int i2 = ((iMo50543du & 1) + iMo50543du) >> 1;
                iMo50551x1 += i - i2;
                iMo50547kk += i2 - i;
                int i3 = iMo50549to ^ iMo50543du;
                iMo50543du ^= i3;
                iMo50549to = i3 ^ iMo50543du;
            }
            if (M52029du != M52034h4) {
                f2 = -f2;
            }
            f = f2 < 0.0f ? f2 + 360.0f : f2;
        }
        C1258im c1258im = new C1258im();
        c1258imArr[0] = c1258im;
        c1258im.f5734x1 = f;
        c1258im.f5733to = M52029du == 1;
        c1258im.f5732kk = M52034h4 == 1;
        tbpVarArr[0] = new tbp(((double) iMo50551x1) / 12700.0d, ((double) iMo50547kk) / 12700.0d);
        tbpVarArr2[0] = new tbp(((double) iMo50549to) / 12700.0d, ((double) iMo50543du) / 12700.0d);
    }
}
