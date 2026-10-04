package com.orion.notein.domain.models;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.fragment.app.Fragment;
import com.huawei.hms.network.embedded.C18361t4;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m80612d2 = {"Lcom/orion/notein/domain/models/DragConstants;", "", "<init>", "()V", "NOTEIN_DRAG_LABEL", "", "DRAG_WINDOWS_CAST", "NOTEIN_DRAG_DATA_ID", "NOTEIN_DRAG_DATA_TYPE", "NOTEIN_DRAG_HOST_ACTIVITY_HASH", "NOTEIN_DRAG_HOST_FRAGMENT_ID", "NOTEIN_DRAG_DATA_JSON", "NOTEIN_DRAG_TYPE_IMAGE", "", "NOTEIN_DRAG_TYPE_TEXT_BOX", "NOTEIN_DRAG_TYPE_TEXT", "NOTEIN_DRAG_TYPE_STROKES", "NOTEIN_DRAG_TYPE_NOTE", "NOTEIN_DRAG_TYPE_DUAL_LINK_IMAGE", "NOTEIN_DRAG_TYPE_LINK_PDF_TEXT", "NOTEIN_DRAG_TYPE_MULTI_ITEMS", "NOTEIN_DRAG_TYPE_SHAPE", "getFragmentHostId", "fragment", "Landroidx/fragment/app/Fragment;", "view", "Landroid/view/View;", "(Landroid/view/View;)Ljava/lang/Integer;", "getActivityHostId", C18361t4.f56218b, "Landroid/app/Activity;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class DragConstants {
    public static final String DRAG_WINDOWS_CAST = "windowscast";
    public static final DragConstants INSTANCE = new DragConstants();
    public static final String NOTEIN_DRAG_DATA_ID = "drag_data_id";
    public static final String NOTEIN_DRAG_DATA_JSON = "drag_data_json";
    public static final String NOTEIN_DRAG_DATA_TYPE = "drag_data_type";
    public static final String NOTEIN_DRAG_HOST_ACTIVITY_HASH = "drag_host_activity_hash";
    public static final String NOTEIN_DRAG_HOST_FRAGMENT_ID = "drag_host_fragment_id";
    public static final String NOTEIN_DRAG_LABEL = "Notein_Drag_Data";
    public static final int NOTEIN_DRAG_TYPE_DUAL_LINK_IMAGE = 5;
    public static final int NOTEIN_DRAG_TYPE_IMAGE = 0;
    public static final int NOTEIN_DRAG_TYPE_LINK_PDF_TEXT = 6;
    public static final int NOTEIN_DRAG_TYPE_MULTI_ITEMS = 7;
    public static final int NOTEIN_DRAG_TYPE_NOTE = 4;
    public static final int NOTEIN_DRAG_TYPE_SHAPE = 8;
    public static final int NOTEIN_DRAG_TYPE_STROKES = 3;
    public static final int NOTEIN_DRAG_TYPE_TEXT = 2;
    public static final int NOTEIN_DRAG_TYPE_TEXT_BOX = 1;

    private DragConstants() {
    }

    public final int getActivityHostId(Activity activity) {
        OooOOO0.OooO0oO(activity, "activity");
        return System.identityHashCode(activity);
    }

    public final int getFragmentHostId(Fragment fragment) {
        OooOOO0.OooO0oO(fragment, "fragment");
        return System.identityHashCode(fragment);
    }

    public final Integer getFragmentHostId(View view) {
        Fragment fragmentOooO0Oo;
        OooOOO0.OooO0oO(view, "view");
        try {
            fragmentOooO0Oo = C21929Ooooo0o.OooO0Oo(view);
        } catch (Exception unused) {
            fragmentOooO0Oo = null;
        }
        if (fragmentOooO0Oo != null) {
            return Integer.valueOf(System.identityHashCode(fragmentOooO0Oo));
        }
        return null;
    }
}
