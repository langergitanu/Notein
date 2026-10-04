package com.aspose.slides.internal.p428tu;

import android.support.v4.media.session.PlaybackStateCompat;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p132fj.C4037ne;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p543z9.C13464ck;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.tu.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C11131jd extends AbstractC11141rv {
    @Override // com.aspose.slides.internal.p428tu.AbstractC11141rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo53663k4(C4037ne[] c4037neArr, C3134k4 c3134k4) {
        C13464ck c13464ck = new C13464ck(c4037neArr[0]);
        long position = c3134k4.m13371ck().getPosition();
        if ((c13464ck.m16027x1() & 65535) < 34) {
            C6005k4.m24260k4("Warning: Invalid ByteCount=0x{0:X8} for WmfEmfEscape.  This value MUST be 34 plus the value of the EnhancedMetafileDataSize field.", Integer.valueOf(c13464ck.m16027x1()));
            return m53664k4(c4037neArr, c3134k4, position);
        }
        c13464ck.m62628k4(c3134k4.m13384uz());
        if ((c13464ck.m62631kk() & 4294967295L) != 1128680791) {
            C6005k4.m24260k4("Warning: Invalid CommentIdentifier=0x{0:X8} for WmfEmfEscape.  This value MUST be 0x43464D57.", Long.valueOf(c13464ck.m62631kk()));
            return m53664k4(c4037neArr, c3134k4, position);
        }
        c13464ck.m62636to(c3134k4.m13384uz());
        if ((c13464ck.m62634to() & 4294967295L) != 1) {
            C6005k4.m24260k4("Warning: Invalid CommentType=0x{0:X8} for WmfEmfEscape. This value MUST be 0x00000001.", Long.valueOf(c13464ck.m62634to()));
            return m53664k4(c4037neArr, c3134k4, position);
        }
        c13464ck.m62619du(c3134k4.m13384uz());
        if ((c13464ck.m62623h4() & 4294967295L) != 65536) {
            C6005k4.m24260k4("Warning: Invalid Version=0x{0:X8} for WmfEmfEscape. This value MUST be 0x00010000.", Long.valueOf(c13464ck.m62623h4()));
            return m53664k4(c4037neArr, c3134k4, position);
        }
        c13464ck.m62635to(c3134k4.m13382u4());
        c13464ck.m62624h4(c3134k4.m13384uz());
        c13464ck.m62633m9(c3134k4.m13384uz());
        c13464ck.m62621dy(c3134k4.m13384uz());
        if ((c13464ck.m62626jd() & 4294967295L) > PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
            C6005k4.m24260k4("Warning: Invalid CurrentRecordSize={0} for WmfEmfEscape.  This value MUST be less than or equal to 8192", Long.valueOf(c13464ck.m62626jd()));
            return m53664k4(c4037neArr, c3134k4, position);
        }
        c13464ck.m62617c5(c3134k4.m13384uz());
        c13464ck.m62627jd(c3134k4.m13384uz());
        if ((c13464ck.m62626jd() & 4294967295L) > (c13464ck.m16027x1() & 65535) - 34) {
            C6005k4.m24260k4("Warning: Invalid EnhancedMetafileDataSize=0x{0:X8} for WmfEmfEscape.  This value MUST be ByteCount - 34.", Long.valueOf(c13464ck.m62626jd()));
            return m53664k4(c4037neArr, c3134k4, position);
        }
        c13464ck.m62630k4(c3134k4.m13372dy((int) c13464ck.m62626jd()));
        c4037neArr[0] = c13464ck;
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m53664k4(C4037ne[] c4037neArr, C3134k4 c3134k4, long j) {
        C13464ck c13464ck = new C13464ck(c4037neArr[0]);
        c3134k4.m13371ck().seek(j, 0);
        long jM16068yj = (c13464ck.m16068yj() & 4294967295L) * 2;
        c13464ck.m62629k4(true);
        c13464ck.m62639x1(c3134k4.m13372dy(C14116yg.m67507x1((int) (((jM16068yj & 4294967295L) - ((long) 10)) & 4294967295L), c13464ck.m16027x1() & 65535)));
        c4037neArr[0] = c13464ck;
        return true;
    }
}
