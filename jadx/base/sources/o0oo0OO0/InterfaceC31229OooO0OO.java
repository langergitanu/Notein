package o0oo0OO0;

import OooOoo0.C20703o000000o;
import android.graphics.Matrix;
import androidx.ink.strokes.C21970OooO0oo;
import com.orion.penkit.models.InkStrokeInfo;
import java.util.Map;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0oo0OO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC31229OooO0OO {

    /* JADX INFO: renamed from: o0oo0OO0.OooO0OO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f111355OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000OO00.OooO0O0 f111356OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final C21970OooO0oo f111357OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Matrix f111358OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final String f111359OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Matrix f111360OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final long f111361OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final Map<String, Float> f111362OooO0oo;

        public OooO00o(String str, o000OO00.OooO0O0 brush, C21970OooO0oo strokeInputs, Matrix matrix, Matrix matrix2, String str2, long j, Map map) {
            OooOOO0.OooO0oO(brush, "brush");
            OooOOO0.OooO0oO(strokeInputs, "strokeInputs");
            this.f111355OooO00o = str;
            this.f111356OooO0O0 = brush;
            this.f111357OooO0OO = strokeInputs;
            this.f111358OooO0Oo = matrix;
            this.f111360OooO0o0 = matrix2;
            this.f111359OooO0o = str2;
            this.f111361OooO0oO = j;
            this.f111362OooO0oo = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f111355OooO00o.equals(oooO00o.f111355OooO00o) && OooOOO0.OooO0O0(this.f111356OooO0O0, oooO00o.f111356OooO0O0) && OooOOO0.OooO0O0(this.f111357OooO0OO, oooO00o.f111357OooO0OO) && this.f111358OooO0Oo.equals(oooO00o.f111358OooO0Oo) && this.f111360OooO0o0.equals(oooO00o.f111360OooO0o0) && this.f111359OooO0o.equals(oooO00o.f111359OooO0o) && this.f111361OooO0oO == oooO00o.f111361OooO0oO && OooOOO0.OooO0O0(this.f111362OooO0oo, oooO00o.f111362OooO0oo);
        }

        public final int hashCode() {
            int iOooO0O0 = C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((this.f111360OooO0o0.hashCode() + ((this.f111358OooO0Oo.hashCode() + ((this.f111357OooO0OO.hashCode() + ((this.f111356OooO0O0.hashCode() + (this.f111355OooO00o.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f111359OooO0o), 31, this.f111361OooO0oO);
            Map<String, Float> map = this.f111362OooO0oo;
            return iOooO0O0 + (map == null ? 0 : map.hashCode());
        }

        public final String toString() {
            return "InkStrokeInfoPart(id=" + this.f111355OooO00o + ", brush=" + this.f111356OooO0O0 + ", strokeInputs=" + this.f111357OooO0OO + ", strokeToWorldTransform=" + this.f111358OooO0Oo + ", worldToViewTransform=" + this.f111360OooO0o0 + ", layerId=" + this.f111359OooO0o + ", creationTime=" + this.f111361OooO0oO + ", behaviorParams=" + this.f111362OooO0oo + ")";
        }
    }

    boolean canDeserialize(String str);

    InkStrokeInfo deserialize(String str);
}
