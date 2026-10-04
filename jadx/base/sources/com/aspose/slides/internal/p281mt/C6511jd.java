package com.aspose.slides.internal.p281mt;

import android.support.v4.media.session.PlaybackStateCompat;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p132fj.C4037ne;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p543z9.C13464ck;

/* JADX INFO: renamed from: com.aspose.slides.internal.mt.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C6511jd extends AbstractC6515ks {
    @Override // com.aspose.slides.internal.p281mt.AbstractC6515ks
    /* JADX INFO: renamed from: k4 */
    public boolean mo26337k4(C4037ne c4037ne, C3149x1 c3149x1) {
        C13464ck c13464ck = (C13464ck) c4037ne;
        if (c13464ck.m62625ix() && c13464ck.m62637u4() != null) {
            c3149x1.m13450k4(c13464ck.m62637u4());
            return true;
        }
        if ((c13464ck.m16027x1() & 65535) < 34) {
            C6005k4.m24260k4("Warning: Invalid ByteCount=0x{0:X8} for WmfEmfEscape.  This value MUST be 34 plus the value of the EnhancedMetafileDataSize field.", Integer.valueOf(c13464ck.m16027x1()));
            return false;
        }
        c3149x1.m13447k4(1128680791L);
        c3149x1.m13447k4(1L);
        c3149x1.m13447k4(65536L);
        c3149x1.m13446k4(c13464ck.m62632m9() & 65535);
        c3149x1.m13447k4(c13464ck.m62620dy() & 4294967295L);
        c3149x1.m13447k4(c13464ck.m62616c5() & 4294967295L);
        c3149x1.m13447k4(c13464ck.m62626jd() & 4294967295L);
        if ((c13464ck.m62626jd() & 4294967295L) > PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
            C6005k4.m24260k4("Warning: Invalid CurrentRecordSize={0} for WmfEmfEscape.  This value MUST be less than or equal to 8192", Long.valueOf(c13464ck.m62626jd()));
            return false;
        }
        c3149x1.m13447k4(c13464ck.m62618ck() & 4294967295L);
        c3149x1.m13447k4(c13464ck.m62622fa() & 4294967295L);
        c3149x1.m13450k4(c13464ck.m62638up());
        return true;
    }
}
