package androidx.appcompat.app;

import OooO0oo.C20441OooO00o;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.orion.notein.global.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class AlertController {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f62245OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f62246OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final DialogInterfaceC21484OooO0oO f62247OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Window f62248OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f62249OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public CharSequence f62250OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public CharSequence f62251OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public RecycleListView f62252OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public View f62253OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f62254OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f62255OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f62256OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f62258OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Button f62259OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public CharSequence f62260OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public Drawable f62261OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public Message f62262OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Button f62263OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public CharSequence f62264OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public Message f62265OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public CharSequence f62266OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public Drawable f62267OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Button f62268OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Drawable f62269OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Message f62270OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public NestedScrollView f62271OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Drawable f62272OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ImageView f62274OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TextView f62275OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final OooO0OO f62276Oooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f62278Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f62279Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public ListAdapter f62280Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final int f62281Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final int f62282Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f62283Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final int f62284Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f62285Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final boolean f62286Oooo0oo;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f62257OooOOO = false;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f62273OooOoo0 = 0;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f62277Oooo0 = -1;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final OooO00o f62287OoooO00 = new OooO00o();

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f62259OooOOOO || (message3 = alertController.f62262OooOOo0) == null) ? (view != alertController.f62263OooOOoo || (message2 = alertController.f62265OooOo0) == null) ? (view != alertController.f62268OooOo0o || (message = alertController.f62270OooOoO0) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            alertController.f62276Oooo.obtainMessage(1, alertController.f62247OooO0O0).sendToTarget();
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Drawable f62289OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContextThemeWrapper f62290OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final LayoutInflater f62291OooO0O0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Drawable f62293OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public View f62294OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public CharSequence f62295OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public CharSequence f62296OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public CharSequence f62297OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public DialogInterface.OnClickListener f62298OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public CharSequence f62299OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Drawable f62300OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public CharSequence f62301OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public DialogInterface.OnClickListener f62302OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public Drawable f62303OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public DialogInterface.OnClickListener f62304OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public DialogInterface.OnCancelListener f62305OooOOo;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public DialogInterface.OnDismissListener f62307OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f62308OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public CharSequence[] f62309OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public DialogInterface.OnKeyListener f62310OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public ListAdapter f62311OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public DialogInterface.OnClickListener f62312OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f62313OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public View f62314OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f62315OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public int f62316OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f62317OooOoo0;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public boolean[] f62319OooOooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f62320Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public boolean f62321Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public boolean f62322Oooo00O;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public Cursor f62324Oooo0O0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public String f62325Oooo0OO;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f62326Oooo0o;

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        public String f62327Oooo0o0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f62292OooO0OO = 0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public boolean f62318OooOooO = false;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public int f62323Oooo00o = -1;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public boolean f62306OooOOo0 = true;

        public OooO0O0(ContextThemeWrapper contextThemeWrapper) {
            this.f62290OooO00o = contextThemeWrapper;
            this.f62291OooO0O0 = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    public static final class OooO0OO extends Handler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public WeakReference<DialogInterface> f62328OooO00o;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f62328OooO00o.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$OooO0Oo, reason: case insensitive filesystem */
    public static class C21476OooO0Oo extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f62329OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f62330OooOo0o;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20441OooO00o.f58298OooOo0);
            this.f62329OooOo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f62330OooOo0o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public AlertController(Context context, DialogInterfaceC21484OooO0oO dialogInterfaceC21484OooO0oO, Window window) {
        this.f62246OooO00o = context;
        this.f62247OooO0O0 = dialogInterfaceC21484OooO0oO;
        this.f62248OooO0OO = window;
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.f62328OooO00o = new WeakReference<>(dialogInterfaceC21484OooO0oO);
        this.f62276Oooo = oooO0OO;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C20441OooO00o.f58284OooO0o0, R.attr.alertDialogStyle, 0);
        this.f62281Oooo0O0 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f62282Oooo0OO = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f62284Oooo0o0 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f62283Oooo0o = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f62285Oooo0oO = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f62286Oooo0oo = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f62249OooO0Oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC21484OooO0oO.supportRequestWindowFeature(1);
    }

    public static boolean OooO00o(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (OooO00o(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup OooO0O0(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void OooO0OO(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Drawable drawable) {
        Message messageObtainMessage = onClickListener != null ? this.f62276Oooo.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f62264OooOo = charSequence;
            this.f62270OooOoO0 = messageObtainMessage;
            this.f62269OooOoO = drawable;
        } else if (i == -2) {
            this.f62266OooOo00 = charSequence;
            this.f62265OooOo0 = messageObtainMessage;
            this.f62267OooOo0O = drawable;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f62260OooOOOo = charSequence;
            this.f62262OooOOo0 = messageObtainMessage;
            this.f62261OooOOo = drawable;
        }
    }
}
