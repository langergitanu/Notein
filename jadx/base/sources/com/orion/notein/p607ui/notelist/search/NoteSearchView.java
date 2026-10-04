package com.orion.notein.p607ui.notelist.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\rB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/search/NoteSearchView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/orion/notein/ui/notelist/search/NoteSearchView$OooO00o;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "LoO00ooO/OooOooO;", "setSearchListener", "(Lcom/orion/notein/ui/notelist/search/NoteSearchView$OooO00o;)V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteSearchView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public View f77978OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public SearchView f77979OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public View f77980OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public View f77981OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final InputMethodManager f77982OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public OooO00o f77983OooOoo0;

    public interface OooO00o {
        void OooO00o(String str);

        void onDismiss();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooOOO0.OooO0oO(context, "context");
        this.f77982OooOoOO = (InputMethodManager) context.getSystemService("input_method");
    }

    public final void OooO00o(int i, boolean z) {
        View view = this.f77981OooOoO0;
        if (view == null) {
            OooOOO0.OooOOOO("searchResultEmptyWrapper");
            throw null;
        }
        view.setVisibility(i);
        View view2 = this.f77980OooOoO;
        if (view2 == null) {
            OooOOO0.OooOOOO("searchResultTip");
            throw null;
        }
        if (!z) {
            i = 8;
        }
        view2.setVisibility(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            SearchView searchView = this.f77979OooOo0o;
            if (searchView == null) {
                OooOOO0.OooOOOO("searchBox");
                throw null;
            }
            if (searchView.getVisibility() == 0) {
                View view = this.f77981OooOoO0;
                if (view == null) {
                    OooOOO0.OooOOOO("searchResultEmptyWrapper");
                    throw null;
                }
                if (view.getVisibility() != 0) {
                    float y = motionEvent.getY();
                    if (this.f77979OooOo0o == null) {
                        OooOOO0.OooOOOO("searchBox");
                        throw null;
                    }
                    if (y > r3.getBottom()) {
                        SearchView searchView2 = this.f77979OooOo0o;
                        if (searchView2 == null) {
                            OooOOO0.OooOOOO("searchBox");
                            throw null;
                        }
                        if (searchView2.hasFocus()) {
                            SearchView searchView3 = this.f77979OooOo0o;
                            if (searchView3 == null) {
                                OooOOO0.OooOOOO("searchBox");
                                throw null;
                            }
                            searchView3.clearFocus();
                            InputMethodManager inputMethodManager = this.f77982OooOoOO;
                            if (inputMethodManager != null) {
                                SearchView searchView4 = this.f77979OooOo0o;
                                if (searchView4 == null) {
                                    OooOOO0.OooOOOO("searchBox");
                                    throw null;
                                }
                                inputMethodManager.hideSoftInputFromWindow(searchView4.getWindowToken(), 0);
                            }
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setSearchListener(OooO00o listener) {
        OooOOO0.OooO0oO(listener, "listener");
        this.f77983OooOoo0 = listener;
    }
}
