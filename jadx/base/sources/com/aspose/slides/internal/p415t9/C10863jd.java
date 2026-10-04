package com.aspose.slides.internal.p415t9;

import android.support.v4.media.session.PlaybackStateCompat;
import com.aspose.slides.internal.p042bn.C1742ne;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p197j1.C5157jd;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.t9.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C10863jd extends AbstractC10873rv {
    @Override // com.aspose.slides.internal.p415t9.AbstractC10873rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo52417k4(C1742ne[] c1742neArr, C3134k4 c3134k4) {
        C5157jd c5157jd = new C5157jd(c1742neArr[0]);
        long position = c3134k4.m13371ck().getPosition();
        if ((c5157jd.m9365x1() & 65535) < 34) {
            C6005k4.m24260k4("Warning: Invalid ByteCount=0x{0:X8} for WmfEmfEscape.  This value MUST be 34 plus the value of the EnhancedMetafileDataSize field.", Integer.valueOf(c5157jd.m9365x1()));
            return m52418k4(c1742neArr, c3134k4, position);
        }
        c5157jd.m22048k4(c3134k4.m13384uz());
        if ((c5157jd.m22051kk() & 4294967295L) != 1128680791) {
            C6005k4.m24260k4("Warning: Invalid CommentIdentifier=0x{0:X8} for WmfEmfEscape.  This value MUST be 0x43464D57.", Long.valueOf(c5157jd.m22051kk()));
            return m52418k4(c1742neArr, c3134k4, position);
        }
        c5157jd.m22056to(c3134k4.m13384uz());
        if ((c5157jd.m22054to() & 4294967295L) != 1) {
            C6005k4.m24260k4("Warning: Invalid CommentType=0x{0:X8} for WmfEmfEscape. This value MUST be 0x00000001.", Long.valueOf(c5157jd.m22054to()));
            return m52418k4(c1742neArr, c3134k4, position);
        }
        c5157jd.m22041du(c3134k4.m13384uz());
        if ((c5157jd.m22044h4() & 4294967295L) != 65536) {
            C6005k4.m24260k4("Warning: Invalid Version=0x{0:X8} for WmfEmfEscape. This value MUST be 0x00010000.", Long.valueOf(c5157jd.m22044h4()));
            return m52418k4(c1742neArr, c3134k4, position);
        }
        c5157jd.m22055to(c3134k4.m13382u4());
        c5157jd.m22045h4(c3134k4.m13384uz());
        c5157jd.m22053m9(c3134k4.m13384uz());
        c5157jd.m22043dy(c3134k4.m13384uz());
        if ((c5157jd.m22052m9() & 4294967295L) > PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
            C6005k4.m24260k4("Warning: Invalid CurrentRecordSize={0} for WmfEmfEscape.  This value MUST be less than or equal to 8192", Long.valueOf(c5157jd.m22052m9()));
            return m52418k4(c1742neArr, c3134k4, position);
        }
        c5157jd.m22038c5(c3134k4.m13384uz());
        c5157jd.m22046jd(c3134k4.m13384uz());
        if ((c5157jd.m22052m9() & 4294967295L) > (c5157jd.m9365x1() & 65535) - 34) {
            C6005k4.m24260k4("Warning: Invalid EnhancedMetafileDataSize=0x{0:X8} for WmfEmfEscape.  This value MUST be ByteCount - 34.", Long.valueOf(c5157jd.m22052m9()));
            return m52418k4(c1742neArr, c3134k4, position);
        }
        c5157jd.m22050k4(c3134k4.m13372dy((int) c5157jd.m22052m9()));
        c1742neArr[0] = c5157jd;
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m52418k4(C1742ne[] c1742neArr, C3134k4 c3134k4, long j) {
        C5157jd c5157jd = new C5157jd(c1742neArr[0]);
        c3134k4.m13371ck().seek(j, 0);
        long jM9402up = (c5157jd.m9402up() & 4294967295L) * 2;
        c5157jd.m22049k4(true);
        c5157jd.m22057x1(c3134k4.m13372dy(C14116yg.m67507x1((int) (((jM9402up & 4294967295L) - ((long) 10)) & 4294967295L), c5157jd.m9365x1() & 65535)));
        c1742neArr[0] = c5157jd;
        return true;
    }
}
