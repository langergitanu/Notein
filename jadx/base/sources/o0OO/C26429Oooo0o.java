package o0OO;

import android.graphics.Color;
import androidx.core.os.BundleKt;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.penkit.tools.DrawToolFactory;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OO.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26429Oooo0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final PenInfo f90755OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final PenInfo f90763OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final PenInfo f90764OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final PenInfo f90765OooOO0O;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final PenInfo f90756OooO00o = new PenInfo("default_ink_pen", 0, 0, 0, C34429OooOOo0.OooOO0o(Integer.valueOf(Color.parseColor("#000000")), Integer.valueOf(Color.parseColor("#333386")), Integer.valueOf(Color.parseColor("#e02020")), Integer.valueOf(Color.parseColor("#854f4f")), Integer.valueOf(Color.parseColor("#673ab7")), Integer.valueOf(Color.parseColor("#0091ff")), Integer.valueOf(Color.parseColor("#44d7b6")), Integer.valueOf(Color.parseColor("#f7b500")), Integer.valueOf(Color.parseColor("#fa6400")), Integer.valueOf(Color.parseColor("#ffffff"))), C34429OooOOo0.OooOO0o(Float.valueOf(0.5f), Float.valueOf(0.7f), Float.valueOf(1.0f), Float.valueOf(2.0f)), null, true, BundleKt.bundleOf(new C32443OooOOO("pressure_correct", Float.valueOf(1.0f)), new C32443OooOOO("speed_correct", Float.valueOf(1.0f)), new C32443OooOOO("group_selected", TelemetryEventStrings.Value.TRUE)));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final PenInfo f90757OooO0O0 = new PenInfo("default_ballpoint_pen", 1, 1, 0, C34429OooOOo0.OooOO0o(Integer.valueOf(Color.parseColor("#000000")), Integer.valueOf(Color.parseColor("#0C1F7F")), Integer.valueOf(Color.parseColor("#D6192A")), Integer.valueOf(Color.parseColor("#7F4F50")), Integer.valueOf(Color.parseColor("#6442B4")), Integer.valueOf(Color.parseColor("#4456B2")), Integer.valueOf(Color.parseColor("#4CBDD2")), Integer.valueOf(Color.parseColor("#F9CF32")), Integer.valueOf(Color.parseColor("#EC611E")), Integer.valueOf(Color.parseColor("#F5F5F5"))), C34429OooOOo0.OooOO0o(Float.valueOf(0.2f), Float.valueOf(0.6f), Float.valueOf(1.0f), Float.valueOf(1.6f)), null, false, BundleKt.bundleOf(new C32443OooOOO("group_selected", TelemetryEventStrings.Value.FALSE)));

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final PenInfo f90758OooO0OO = new PenInfo("default_pencil", 10, 0, 0, C34429OooOOo0.OooOO0o(Integer.valueOf(Color.parseColor("#000000")), Integer.valueOf(Color.parseColor("#0C1F7F")), Integer.valueOf(Color.parseColor("#D6192A")), Integer.valueOf(Color.parseColor("#7F4F50")), Integer.valueOf(Color.parseColor("#6442B4")), Integer.valueOf(Color.parseColor("#4456B2")), Integer.valueOf(Color.parseColor("#4CBDD2")), Integer.valueOf(Color.parseColor("#F9CF32")), Integer.valueOf(Color.parseColor("#EC611E")), Integer.valueOf(Color.parseColor("#F5F5F5"))), C34429OooOOo0.OooOO0o(Float.valueOf(0.2f), Float.valueOf(0.6f), Float.valueOf(1.0f), Float.valueOf(1.6f)), null, false, BundleKt.bundleOf(new C32443OooOOO("group_selected", TelemetryEventStrings.Value.TRUE)));

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final PenInfo f90759OooO0Oo = new PenInfo("default_rainbow_pen", 12, 0, 0, C34429OooOOo0.OooOO0o(Integer.valueOf(Color.parseColor("#FBF0D2")), Integer.valueOf(Color.parseColor("#E5F4BA")), Integer.valueOf(Color.parseColor("#DFEDFB")), Integer.valueOf(Color.parseColor("#F1D2F2")), Integer.valueOf(Color.parseColor("#FFB9B9")), Integer.valueOf(Color.parseColor("#FACF69")), Integer.valueOf(Color.parseColor("#92D4C1")), Integer.valueOf(Color.parseColor("#99BAF6")), Integer.valueOf(Color.parseColor("#F69CC5")), Integer.valueOf(Color.parseColor("#ED7372"))), C34429OooOOo0.OooOO0o(Float.valueOf(0.2f), Float.valueOf(0.6f), Float.valueOf(1.0f), Float.valueOf(1.6f)), null, false, BundleKt.bundleOf(new C32443OooOOO("group_selected", TelemetryEventStrings.Value.FALSE)));

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final PenInfo f90761OooO0o0 = new PenInfo("default_highlighter_pen", 2, 0, 0, C34429OooOOo0.OooOO0o(Integer.valueOf(Color.parseColor("#F8E384")), Integer.valueOf(Color.parseColor("#F3AE83")), Integer.valueOf(Color.parseColor("#F07EBD")), Integer.valueOf(Color.parseColor("#DB82F9")), Integer.valueOf(Color.parseColor("#A682F8")), Integer.valueOf(Color.parseColor("#8194F8")), Integer.valueOf(Color.parseColor("#93EEFB")), Integer.valueOf(Color.parseColor("#C9F984")), Integer.valueOf(Color.parseColor("#EF7B7E")), Integer.valueOf(Color.parseColor("#7C7C7C"))), C34429OooOOo0.OooOO0o(Float.valueOf(1.0f), Float.valueOf(2.0f), Float.valueOf(3.0f), Float.valueOf(4.0f)), null, false, BundleKt.bundleOf(new C32443OooOOO("group_selected", TelemetryEventStrings.Value.TRUE)));

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final PenInfo f90760OooO0o = new PenInfo("default_highlighter_pen_rect", 9, 0, 0, C34429OooOOo0.OooOO0o(Integer.valueOf(Color.parseColor("#F8E384")), Integer.valueOf(Color.parseColor("#F3AE83")), Integer.valueOf(Color.parseColor("#F07EBD")), Integer.valueOf(Color.parseColor("#DB82F9")), Integer.valueOf(Color.parseColor("#A682F8")), Integer.valueOf(Color.parseColor("#8194F8")), Integer.valueOf(Color.parseColor("#93EEFB")), Integer.valueOf(Color.parseColor("#C9F984")), Integer.valueOf(Color.parseColor("#EF7B7E")), Integer.valueOf(Color.parseColor("#7C7C7C"))), C34429OooOOo0.OooOO0o(Float.valueOf(1.0f), Float.valueOf(2.0f), Float.valueOf(3.0f), Float.valueOf(4.0f)), null, false, BundleKt.bundleOf(new C32443OooOOO("group_selected", TelemetryEventStrings.Value.FALSE)));

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final PenInfo f90762OooO0oO = new PenInfo("default_tape_pen", 11, 2, 0, C34429OooOOo0.OooOO0o(Integer.valueOf(Color.parseColor("#FBF0D2")), Integer.valueOf(Color.parseColor("#E5F4BA")), Integer.valueOf(Color.parseColor("#DFEDFB")), Integer.valueOf(Color.parseColor("#F1D2F2")), Integer.valueOf(Color.parseColor("#FFB9B9")), Integer.valueOf(Color.parseColor("#FACF69")), Integer.valueOf(Color.parseColor("#92D4C1")), Integer.valueOf(Color.parseColor("#99BAF6")), Integer.valueOf(Color.parseColor("#F69CC5")), Integer.valueOf(Color.parseColor("#ED7372"))), C34429OooOOo0.OooOO0o(Float.valueOf(2.0f), Float.valueOf(3.0f), Float.valueOf(5.0f)), null, false, BundleKt.bundleOf(new C32443OooOOO("draw_line_directly", TelemetryEventStrings.Value.FALSE)));

    static {
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        f90763OooO0oo = new PenInfo("default_eraser", 3, 0, 0, c34434OooOoO, C34429OooOOo0.OooOO0o(Float.valueOf(2.0f), Float.valueOf(5.0f), Float.valueOf(8.0f), Float.valueOf(10.0f)), null, false, BundleKt.bundleOf(new C32443OooOOO(C18437z2.f56754h, DrawToolFactory.ERASER_TYPE_PIXEL)));
        f90755OooO = new PenInfo("default_lasso", 4, 0, 0, C34429OooOOo0.OooOO0o(Integer.valueOf(Color.parseColor("#000000")), Integer.valueOf(Color.parseColor("#333386")), Integer.valueOf(Color.parseColor("#e02020")), Integer.valueOf(Color.parseColor("#854f4f")), Integer.valueOf(Color.parseColor("#673ab7")), Integer.valueOf(Color.parseColor("#0091ff")), Integer.valueOf(Color.parseColor("#44d7b6")), Integer.valueOf(Color.parseColor("#f7b500")), Integer.valueOf(Color.parseColor("#fa6400")), Integer.valueOf(Color.parseColor("#ffffff"))), c34434OooOoO, null, false, BundleKt.bundleOf(new C32443OooOOO(C18437z2.f56754h, DrawToolFactory.LASSO_TYPE_FREE), new C32443OooOOO("filter", "shape,text,image")));
        f90764OooOO0 = new PenInfo("default_vector_pen", 8, 2, 0, C34429OooOOo0.OooOO0o(Integer.valueOf(Color.parseColor("#000000")), Integer.valueOf(Color.parseColor("#333386")), Integer.valueOf(Color.parseColor("#e02020")), Integer.valueOf(Color.parseColor("#854f4f")), Integer.valueOf(Color.parseColor("#673ab7")), Integer.valueOf(Color.parseColor("#0091ff")), Integer.valueOf(Color.parseColor("#44d7b6")), Integer.valueOf(Color.parseColor("#f7b500")), Integer.valueOf(Color.parseColor("#fa6400")), Integer.valueOf(Color.parseColor("#ffffff"))), C34429OooOOo0.OooOO0o(Float.valueOf(0.2f), Float.valueOf(0.6f), Float.valueOf(1.0f)), null, false, BundleKt.bundleOf(new C32443OooOOO(C18437z2.f56754h, "7")));
        f90765OooOO0O = new PenInfo("default_laser", 7, 2, 0, C34429OooOOo0.OooOO0o(Integer.valueOf(Color.parseColor("#000000")), Integer.valueOf(Color.parseColor("#333386")), Integer.valueOf(Color.parseColor("#e02020")), Integer.valueOf(Color.parseColor("#854f4f")), Integer.valueOf(Color.parseColor("#673ab7")), Integer.valueOf(Color.parseColor("#0091ff")), Integer.valueOf(Color.parseColor("#44d7b6")), Integer.valueOf(Color.parseColor("#f7b500")), Integer.valueOf(Color.parseColor("#fa6400")), Integer.valueOf(Color.parseColor("#ffffff"))), C34429OooOOo0.OooOO0o(Float.valueOf(0.8f), Float.valueOf(1.2f), Float.valueOf(1.6f)), null, false, BundleKt.bundleOf(new C32443OooOOO(C18437z2.f56754h, "line"), new C32443OooOOO("disappear_type", "fade")));
    }
}
