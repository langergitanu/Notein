package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: androidx.appcompat.app.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC21484OooO0oO extends DialogC21495OooOoO implements DialogInterface {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AlertController f62437OooOo0o;

    /* JADX INFO: renamed from: androidx.appcompat.app.OooO0oO$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: P */
        private final AlertController.OooO0O0 f0P;
        private final int mTheme;

        public OooO00o(Context context) {
            this(context, DialogInterfaceC21484OooO0oO.OooOo0(context, 0));
        }

        public DialogInterfaceC21484OooO0oO create() {
            AlertController alertController;
            ListAdapter simpleCursorAdapter;
            DialogInterfaceC21484OooO0oO dialogInterfaceC21484OooO0oO = new DialogInterfaceC21484OooO0oO(this.f0P.f62290OooO00o, this.mTheme);
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            View view = oooO0O0.f62294OooO0o;
            AlertController alertController2 = dialogInterfaceC21484OooO0oO.f62437OooOo0o;
            if (view != null) {
                alertController2.f62279Oooo00O = view;
            } else {
                CharSequence charSequence = oooO0O0.f62295OooO0o0;
                if (charSequence != null) {
                    alertController2.f62251OooO0o0 = charSequence;
                    TextView textView = alertController2.f62275OooOooo;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = oooO0O0.f62293OooO0Oo;
                if (drawable != null) {
                    alertController2.f62272OooOoo = drawable;
                    alertController2.f62273OooOoo0 = 0;
                    ImageView imageView = alertController2.f62274OooOooO;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController2.f62274OooOooO.setImageDrawable(drawable);
                    }
                }
                int i = oooO0O0.f62292OooO0OO;
                if (i != 0) {
                    alertController2.f62272OooOoo = null;
                    alertController2.f62273OooOoo0 = i;
                    ImageView imageView2 = alertController2.f62274OooOooO;
                    if (imageView2 != null) {
                        if (i != 0) {
                            imageView2.setVisibility(0);
                            alertController2.f62274OooOooO.setImageResource(alertController2.f62273OooOoo0);
                        } else {
                            imageView2.setVisibility(8);
                        }
                    }
                }
            }
            CharSequence charSequence2 = oooO0O0.f62296OooO0oO;
            if (charSequence2 != null) {
                alertController2.f62250OooO0o = charSequence2;
                TextView textView2 = alertController2.f62278Oooo000;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = oooO0O0.f62297OooO0oo;
            if (charSequence3 != null || oooO0O0.f62289OooO != null) {
                alertController2.OooO0OO(-1, charSequence3, oooO0O0.f62298OooOO0, oooO0O0.f62289OooO);
            }
            CharSequence charSequence4 = oooO0O0.f62299OooOO0O;
            if (charSequence4 != null || oooO0O0.f62300OooOO0o != null) {
                alertController2.OooO0OO(-2, charSequence4, oooO0O0.f62302OooOOO0, oooO0O0.f62300OooOO0o);
            }
            CharSequence charSequence5 = oooO0O0.f62301OooOOO;
            if (charSequence5 != null || oooO0O0.f62303OooOOOO != null) {
                alertController2.OooO0OO(-3, charSequence5, oooO0O0.f62304OooOOOo, oooO0O0.f62303OooOOOO);
            }
            if (oooO0O0.f62309OooOo0 == null && oooO0O0.f62324Oooo0O0 == null && oooO0O0.f62311OooOo0O == null) {
                alertController = alertController2;
            } else {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) oooO0O0.f62291OooO0O0.inflate(alertController2.f62282Oooo0OO, (ViewGroup) null);
                boolean z = oooO0O0.f62321Oooo000;
                ContextThemeWrapper contextThemeWrapper = oooO0O0.f62290OooO00o;
                if (!z) {
                    alertController = alertController2;
                    int i2 = oooO0O0.f62322Oooo00O ? alertController.f62283Oooo0o : alertController.f62285Oooo0oO;
                    if (oooO0O0.f62324Oooo0O0 != null) {
                        simpleCursorAdapter = new SimpleCursorAdapter(contextThemeWrapper, i2, oooO0O0.f62324Oooo0O0, new String[]{oooO0O0.f62325Oooo0OO}, new int[]{R.id.text1});
                    } else {
                        ListAdapter c21476OooO0Oo = oooO0O0.f62311OooOo0O;
                        if (c21476OooO0Oo == null) {
                            c21476OooO0Oo = new AlertController.C21476OooO0Oo(contextThemeWrapper, i2, R.id.text1, oooO0O0.f62309OooOo0);
                        }
                        simpleCursorAdapter = c21476OooO0Oo;
                    }
                } else if (oooO0O0.f62324Oooo0O0 == null) {
                    simpleCursorAdapter = new OooO0OO(oooO0O0, contextThemeWrapper, alertController2.f62284Oooo0o0, oooO0O0.f62309OooOo0, recycleListView);
                    recycleListView = recycleListView;
                    alertController = alertController2;
                } else {
                    alertController = alertController2;
                    simpleCursorAdapter = new C21482OooO0Oo(oooO0O0, contextThemeWrapper, oooO0O0.f62324Oooo0O0, recycleListView, alertController);
                }
                alertController.f62280Oooo00o = simpleCursorAdapter;
                alertController.f62277Oooo0 = oooO0O0.f62323Oooo00o;
                if (oooO0O0.f62312OooOo0o != null) {
                    recycleListView.setOnItemClickListener(new C21483OooO0o0(oooO0O0, alertController));
                } else if (oooO0O0.f62320Oooo0 != null) {
                    recycleListView.setOnItemClickListener(new OooO0o(oooO0O0, recycleListView, alertController));
                }
                AdapterView.OnItemSelectedListener onItemSelectedListener = oooO0O0.f62326Oooo0o;
                if (onItemSelectedListener != null) {
                    recycleListView.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (oooO0O0.f62322Oooo00O) {
                    recycleListView.setChoiceMode(1);
                } else if (oooO0O0.f62321Oooo000) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f62252OooO0oO = recycleListView;
            }
            View view2 = oooO0O0.f62314OooOoO0;
            if (view2 == null) {
                int i3 = oooO0O0.f62308OooOo;
                if (i3 != 0) {
                    alertController.f62253OooO0oo = null;
                    alertController.f62245OooO = i3;
                    alertController.f62257OooOOO = false;
                }
            } else if (oooO0O0.f62318OooOooO) {
                int i4 = oooO0O0.f62313OooOoO;
                int i5 = oooO0O0.f62315OooOoOO;
                int i6 = oooO0O0.f62317OooOoo0;
                int i7 = oooO0O0.f62316OooOoo;
                alertController.f62253OooO0oo = view2;
                alertController.f62245OooO = 0;
                alertController.f62257OooOOO = true;
                alertController.f62254OooOO0 = i4;
                alertController.f62255OooOO0O = i5;
                alertController.f62256OooOO0o = i6;
                alertController.f62258OooOOO0 = i7;
            } else {
                alertController.f62253OooO0oo = view2;
                alertController.f62245OooO = 0;
                alertController.f62257OooOOO = false;
            }
            dialogInterfaceC21484OooO0oO.setCancelable(this.f0P.f62306OooOOo0);
            if (this.f0P.f62306OooOOo0) {
                dialogInterfaceC21484OooO0oO.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC21484OooO0oO.setOnCancelListener(this.f0P.f62305OooOOo);
            dialogInterfaceC21484OooO0oO.setOnDismissListener(this.f0P.f62307OooOOoo);
            DialogInterface.OnKeyListener onKeyListener = this.f0P.f62310OooOo00;
            if (onKeyListener != null) {
                dialogInterfaceC21484OooO0oO.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC21484OooO0oO;
        }

        public Context getContext() {
            return this.f0P.f62290OooO00o;
        }

        public OooO00o setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62311OooOo0O = listAdapter;
            oooO0O0.f62312OooOo0o = onClickListener;
            return this;
        }

        public OooO00o setCancelable(boolean z) {
            this.f0P.f62306OooOOo0 = z;
            return this;
        }

        public OooO00o setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62324Oooo0O0 = cursor;
            oooO0O0.f62325Oooo0OO = str;
            oooO0O0.f62312OooOo0o = onClickListener;
            return this;
        }

        public OooO00o setCustomTitle(View view) {
            this.f0P.f62294OooO0o = view;
            return this;
        }

        public OooO00o setIcon(int i) {
            this.f0P.f62292OooO0OO = i;
            return this;
        }

        public OooO00o setIconAttribute(int i) {
            TypedValue typedValue = new TypedValue();
            this.f0P.f62290OooO00o.getTheme().resolveAttribute(i, typedValue, true);
            this.f0P.f62292OooO0OO = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public OooO00o setInverseBackgroundForced(boolean z) {
            this.f0P.getClass();
            return this;
        }

        public OooO00o setItems(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62309OooOo0 = oooO0O0.f62290OooO00o.getResources().getTextArray(i);
            this.f0P.f62312OooOo0o = onClickListener;
            return this;
        }

        public OooO00o setMessage(int i) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62296OooO0oO = oooO0O0.f62290OooO00o.getText(i);
            return this;
        }

        public OooO00o setMultiChoiceItems(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62309OooOo0 = oooO0O0.f62290OooO00o.getResources().getTextArray(i);
            AlertController.OooO0O0 oooO0O02 = this.f0P;
            oooO0O02.f62320Oooo0 = onMultiChoiceClickListener;
            oooO0O02.f62319OooOooo = zArr;
            oooO0O02.f62321Oooo000 = true;
            return this;
        }

        public OooO00o setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62299OooOO0O = oooO0O0.f62290OooO00o.getText(i);
            this.f0P.f62302OooOOO0 = onClickListener;
            return this;
        }

        public OooO00o setNegativeButtonIcon(Drawable drawable) {
            this.f0P.f62300OooOO0o = drawable;
            return this;
        }

        public OooO00o setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62301OooOOO = oooO0O0.f62290OooO00o.getText(i);
            this.f0P.f62304OooOOOo = onClickListener;
            return this;
        }

        public OooO00o setNeutralButtonIcon(Drawable drawable) {
            this.f0P.f62303OooOOOO = drawable;
            return this;
        }

        public OooO00o setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f0P.f62305OooOOo = onCancelListener;
            return this;
        }

        public OooO00o setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f0P.f62307OooOOoo = onDismissListener;
            return this;
        }

        public OooO00o setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f0P.f62326Oooo0o = onItemSelectedListener;
            return this;
        }

        public OooO00o setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f0P.f62310OooOo00 = onKeyListener;
            return this;
        }

        public OooO00o setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62297OooO0oo = oooO0O0.f62290OooO00o.getText(i);
            this.f0P.f62298OooOO0 = onClickListener;
            return this;
        }

        public OooO00o setPositiveButtonIcon(Drawable drawable) {
            this.f0P.f62289OooO = drawable;
            return this;
        }

        public OooO00o setRecycleOnMeasureEnabled(boolean z) {
            this.f0P.getClass();
            return this;
        }

        public OooO00o setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62309OooOo0 = oooO0O0.f62290OooO00o.getResources().getTextArray(i);
            AlertController.OooO0O0 oooO0O02 = this.f0P;
            oooO0O02.f62312OooOo0o = onClickListener;
            oooO0O02.f62323Oooo00o = i2;
            oooO0O02.f62322Oooo00O = true;
            return this;
        }

        public OooO00o setTitle(int i) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62295OooO0o0 = oooO0O0.f62290OooO00o.getText(i);
            return this;
        }

        public OooO00o setView(int i) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62314OooOoO0 = null;
            oooO0O0.f62308OooOo = i;
            oooO0O0.f62318OooOooO = false;
            return this;
        }

        public DialogInterfaceC21484OooO0oO show() {
            DialogInterfaceC21484OooO0oO dialogInterfaceC21484OooO0oOCreate = create();
            dialogInterfaceC21484OooO0oOCreate.show();
            return dialogInterfaceC21484OooO0oOCreate;
        }

        public OooO00o(Context context, int i) {
            this.f0P = new AlertController.OooO0O0(new ContextThemeWrapper(context, DialogInterfaceC21484OooO0oO.OooOo0(context, i)));
            this.mTheme = i;
        }

        public OooO00o setIcon(Drawable drawable) {
            this.f0P.f62293OooO0Oo = drawable;
            return this;
        }

        public OooO00o setMessage(CharSequence charSequence) {
            this.f0P.f62296OooO0oO = charSequence;
            return this;
        }

        public OooO00o setTitle(CharSequence charSequence) {
            this.f0P.f62295OooO0o0 = charSequence;
            return this;
        }

        public OooO00o setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62309OooOo0 = charSequenceArr;
            oooO0O0.f62312OooOo0o = onClickListener;
            return this;
        }

        public OooO00o setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62299OooOO0O = charSequence;
            oooO0O0.f62302OooOOO0 = onClickListener;
            return this;
        }

        public OooO00o setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62301OooOOO = charSequence;
            oooO0O0.f62304OooOOOo = onClickListener;
            return this;
        }

        public OooO00o setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62297OooO0oo = charSequence;
            oooO0O0.f62298OooOO0 = onClickListener;
            return this;
        }

        public OooO00o setView(View view) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62314OooOoO0 = view;
            oooO0O0.f62308OooOo = 0;
            oooO0O0.f62318OooOooO = false;
            return this;
        }

        public OooO00o setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62309OooOo0 = charSequenceArr;
            oooO0O0.f62320Oooo0 = onMultiChoiceClickListener;
            oooO0O0.f62319OooOooo = zArr;
            oooO0O0.f62321Oooo000 = true;
            return this;
        }

        public OooO00o setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62324Oooo0O0 = cursor;
            oooO0O0.f62312OooOo0o = onClickListener;
            oooO0O0.f62323Oooo00o = i;
            oooO0O0.f62325Oooo0OO = str;
            oooO0O0.f62322Oooo00O = true;
            return this;
        }

        @Deprecated
        public OooO00o setView(View view, int i, int i2, int i3, int i4) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62314OooOoO0 = view;
            oooO0O0.f62308OooOo = 0;
            oooO0O0.f62318OooOooO = true;
            oooO0O0.f62313OooOoO = i;
            oooO0O0.f62315OooOoOO = i2;
            oooO0O0.f62317OooOoo0 = i3;
            oooO0O0.f62316OooOoo = i4;
            return this;
        }

        public OooO00o setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62324Oooo0O0 = cursor;
            oooO0O0.f62320Oooo0 = onMultiChoiceClickListener;
            oooO0O0.f62327Oooo0o0 = str;
            oooO0O0.f62325Oooo0OO = str2;
            oooO0O0.f62321Oooo000 = true;
            return this;
        }

        public OooO00o setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62309OooOo0 = charSequenceArr;
            oooO0O0.f62312OooOo0o = onClickListener;
            oooO0O0.f62323Oooo00o = i;
            oooO0O0.f62322Oooo00O = true;
            return this;
        }

        public OooO00o setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0O0 oooO0O0 = this.f0P;
            oooO0O0.f62311OooOo0O = listAdapter;
            oooO0O0.f62312OooOo0o = onClickListener;
            oooO0O0.f62323Oooo00o = i;
            oooO0O0.f62322Oooo00O = true;
            return this;
        }
    }

    public DialogInterfaceC21484OooO0oO(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, OooOo0(contextThemeWrapper, i));
        this.f62437OooOo0o = new AlertController(getContext(), this, getWindow());
    }

    public static int OooOo0(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.orion.notein.global.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.appcompat.app.DialogC21495OooOoO, OooO0Oo.OooOo00, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        View view;
        int i2;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f62437OooOo0o;
        alertController.f62247OooO0O0.setContentView(alertController.f62281Oooo0O0);
        Window window = alertController.f62248OooO0OO;
        View viewFindViewById2 = window.findViewById(com.orion.notein.global.R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(com.orion.notein.global.R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(com.orion.notein.global.R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(com.orion.notein.global.R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(com.orion.notein.global.R.id.customPanel);
        View viewInflate = alertController.f62253OooO0oo;
        Context context = alertController.f62246OooO00o;
        if (viewInflate == null) {
            viewInflate = alertController.f62245OooO != 0 ? LayoutInflater.from(context).inflate(alertController.f62245OooO, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !AlertController.OooO00o(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(com.orion.notein.global.R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f62257OooOOO) {
                frameLayout.setPadding(alertController.f62254OooOO0, alertController.f62255OooOO0O, alertController.f62256OooOO0o, alertController.f62258OooOOO0);
            }
            if (alertController.f62252OooO0oO != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.OooO00o) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(com.orion.notein.global.R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(com.orion.notein.global.R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(com.orion.notein.global.R.id.buttonPanel);
        ViewGroup viewGroupOooO0O0 = AlertController.OooO0O0(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupOooO0O02 = AlertController.OooO0O0(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupOooO0O03 = AlertController.OooO0O0(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(com.orion.notein.global.R.id.scrollView);
        alertController.f62271OooOoOO = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f62271OooOoOO.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupOooO0O02.findViewById(R.id.message);
        alertController.f62278Oooo000 = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f62250OooO0o;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.f62271OooOoOO.removeView(alertController.f62278Oooo000);
                if (alertController.f62252OooO0oO != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f62271OooOoOO.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.f62271OooOoOO);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.f62252OooO0oO, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupOooO0O02.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupOooO0O03.findViewById(R.id.button1);
        alertController.f62259OooOOOO = button;
        AlertController.OooO00o oooO00o = alertController.f62287OoooO00;
        button.setOnClickListener(oooO00o);
        boolean zIsEmpty = TextUtils.isEmpty(alertController.f62260OooOOOo);
        int i3 = alertController.f62249OooO0Oo;
        if (zIsEmpty && alertController.f62261OooOOo == null) {
            alertController.f62259OooOOOO.setVisibility(8);
            i = 0;
        } else {
            alertController.f62259OooOOOO.setText(alertController.f62260OooOOOo);
            Drawable drawable = alertController.f62261OooOOo;
            if (drawable != null) {
                drawable.setBounds(0, 0, i3, i3);
                alertController.f62259OooOOOO.setCompoundDrawables(alertController.f62261OooOOo, null, null, null);
            }
            alertController.f62259OooOOOO.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupOooO0O03.findViewById(R.id.button2);
        alertController.f62263OooOOoo = button2;
        button2.setOnClickListener(oooO00o);
        if (TextUtils.isEmpty(alertController.f62266OooOo00) && alertController.f62267OooOo0O == null) {
            alertController.f62263OooOOoo.setVisibility(8);
        } else {
            alertController.f62263OooOOoo.setText(alertController.f62266OooOo00);
            Drawable drawable2 = alertController.f62267OooOo0O;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i3, i3);
                alertController.f62263OooOOoo.setCompoundDrawables(alertController.f62267OooOo0O, null, null, null);
            }
            alertController.f62263OooOOoo.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupOooO0O03.findViewById(R.id.button3);
        alertController.f62268OooOo0o = button3;
        button3.setOnClickListener(oooO00o);
        if (TextUtils.isEmpty(alertController.f62264OooOo) && alertController.f62269OooOoO == null) {
            alertController.f62268OooOo0o.setVisibility(8);
            view = null;
        } else {
            alertController.f62268OooOo0o.setText(alertController.f62264OooOo);
            Drawable drawable3 = alertController.f62269OooOoO;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i3, i3);
                view = null;
                alertController.f62268OooOo0o.setCompoundDrawables(alertController.f62269OooOoO, null, null, null);
            } else {
                view = null;
            }
            alertController.f62268OooOo0o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.orion.notein.global.R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = alertController.f62259OooOOOO;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = alertController.f62263OooOOoo;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = alertController.f62268OooOo0o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupOooO0O03.setVisibility(8);
        }
        if (alertController.f62279Oooo00O != null) {
            viewGroupOooO0O0.addView(alertController.f62279Oooo00O, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(com.orion.notein.global.R.id.title_template).setVisibility(8);
        } else {
            alertController.f62274OooOooO = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(alertController.f62251OooO0o0) || !alertController.f62286Oooo0oo) {
                window.findViewById(com.orion.notein.global.R.id.title_template).setVisibility(8);
                alertController.f62274OooOooO.setVisibility(8);
                viewGroupOooO0O0.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(com.orion.notein.global.R.id.alertTitle);
                alertController.f62275OooOooo = textView2;
                textView2.setText(alertController.f62251OooO0o0);
                int i4 = alertController.f62273OooOoo0;
                if (i4 != 0) {
                    alertController.f62274OooOooO.setImageResource(i4);
                } else {
                    Drawable drawable4 = alertController.f62272OooOoo;
                    if (drawable4 != null) {
                        alertController.f62274OooOooO.setImageDrawable(drawable4);
                    } else {
                        alertController.f62275OooOooo.setPadding(alertController.f62274OooOooO.getPaddingLeft(), alertController.f62274OooOooO.getPaddingTop(), alertController.f62274OooOooO.getPaddingRight(), alertController.f62274OooOooO.getPaddingBottom());
                        alertController.f62274OooOooO.setVisibility(8);
                    }
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i5 = (viewGroupOooO0O0 == null || viewGroupOooO0O0.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupOooO0O03.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupOooO0O02.findViewById(com.orion.notein.global.R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f62271OooOoOO;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (alertController.f62250OooO0o == null && alertController.f62252OooO0oO == null) ? view : viewGroupOooO0O0.findViewById(com.orion.notein.global.R.id.titleDividerNoCustom);
            i2 = 0;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            i2 = 0;
            View viewFindViewById10 = viewGroupOooO0O02.findViewById(com.orion.notein.global.R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f62252OooO0oO;
        if (recycleListView != null && (!z3 || i5 == 0)) {
            recycleListView.setPadding(recycleListView.getPaddingLeft(), i5 != 0 ? recycleListView.getPaddingTop() : recycleListView.f62330OooOo0o, recycleListView.getPaddingRight(), z3 ? recycleListView.getPaddingBottom() : recycleListView.f62329OooOo);
        }
        if (!z2) {
            View view2 = alertController.f62252OooO0oO;
            if (view2 == null) {
                view2 = alertController.f62271OooOoOO;
            }
            if (view2 != null) {
                int i6 = z3 ? 2 : i2;
                View viewFindViewById11 = window.findViewById(com.orion.notein.global.R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(com.orion.notein.global.R.id.scrollIndicatorDown);
                ViewCompat.setScrollIndicators(view2, i5 | i6, 3);
                if (viewFindViewById11 != null) {
                    viewGroupOooO0O02.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupOooO0O02.removeView(viewFindViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f62252OooO0oO;
        if (recycleListView2 == null || (listAdapter = alertController.f62280Oooo00o) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i7 = alertController.f62277Oooo0;
        if (i7 > -1) {
            recycleListView2.setItemChecked(i7, true);
            recycleListView2.setSelection(i7);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f62437OooOo0o.f62271OooOoOO;
        if (nestedScrollView == null || !nestedScrollView.executeKeyEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f62437OooOo0o.f62271OooOoOO;
        if (nestedScrollView == null || !nestedScrollView.executeKeyEvent(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.app.DialogC21495OooOoO, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f62437OooOo0o;
        alertController.f62251OooO0o0 = charSequence;
        TextView textView = alertController.f62275OooOooo;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
