package o0OoOOOo;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.domain.models.User;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.C23383OooO0Oo;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import com.orion.notein.p607ui.user.settings.home.UserSettingFragment;
import java.util.concurrent.CancellationException;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0Oo00oo.C28039OooO00o;
import o0oOoO0.C30995OooO0OO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.o00000OO;

/* JADX INFO: renamed from: o0OoOOOo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29119OooOoo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103191OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103192OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ View f103193OooOoO0;

    public /* synthetic */ ViewOnClickListenerC29119OooOoo0(Object obj, View view, int i) {
        this.f103192OooOo0o = i;
        this.f103191OooOo = obj;
        this.f103193OooOoO0 = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        String wxOpenID;
        String hwOpenID;
        String wxOpenID2;
        String hwOpenID2;
        String wxOpenID3;
        View view2 = this.f103193OooOoO0;
        Object obj = this.f103191OooOo;
        switch (this.f103192OooOo0o) {
            case 0:
                TextView textView = (TextView) obj;
                int i2 = TextStyleBox.f74132o000oOoO;
                try {
                    i = Integer.parseInt(textView.getText().toString());
                } catch (Exception unused) {
                    i = 20;
                }
                TextStyleBox textStyleBox = (TextStyleBox) view2;
                C23383OooO0Oo c23383OooO0Oo = textStyleBox.f74148Oooo0OO;
                if (c23383OooO0Oo.f74115OooO00o.isShowing()) {
                    c23383OooO0Oo.dismiss();
                } else {
                    for (InterfaceC29093OooO00o interfaceC29093OooO00o : textStyleBox.f74154OoooO0) {
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC29093OooO00o, c23383OooO0Oo)) {
                            interfaceC29093OooO00o.dismiss();
                        }
                    }
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(textView);
                    c23383OooO0Oo.getClass();
                    PopupWindow popupWindow = c23383OooO0Oo.f74115OooO00o;
                    c23383OooO0Oo.f74117OooO0OO.setText(popupWindow.getContentView().getContext().getString(R.string.font_size_desc, Integer.valueOf(i)));
                    SeekBar seekBar = c23383OooO0Oo.f74119OooO0o;
                    seekBar.setProgress(i - 5);
                    popupWindow.showAsDropDown(textView, 0, -(C23383OooO0Oo.f74113OooOO0 + C23383OooO0Oo.f74114OooOO0O));
                    C23383OooO0Oo.OooO00o oooO00o = c23383OooO0Oo.f74122OooO0oo;
                    if (oooO00o != null) {
                        oooO00o.OooO00o(0);
                    }
                    seekBar.setOnSeekBarChangeListener(c23383OooO0Oo.f74121OooO0oO);
                }
                break;
            default:
                UserSettingFragment userSettingFragment = (UserSettingFragment) obj;
                User user = (User) userSettingFragment.OooOoOO().f90225OooOoO.f121747OooOo0o.getValue();
                if (user != null) {
                    String honorOpenID = user.getHonorOpenID();
                    if (honorOpenID == null || honorOpenID.length() == 0) {
                        o00000OO o00000oo2 = userSettingFragment.f79863OoooOOo;
                        if (o00000oo2 != null) {
                            o00000oo2.cancel((CancellationException) null);
                        }
                        InterfaceC21987OooOoo viewLifecycleOwner = userSettingFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        userSettingFragment.f79863OoooOOo = C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30995OooO0OO(userSettingFragment, null), 3);
                    } else {
                        Context context = view2.getContext();
                        if (context != null) {
                            if (C28039OooO00o.OooO0O0()) {
                                if (user.getMobile().length() == 0 && ((wxOpenID3 = user.getWxOpenID()) == null || wxOpenID3.length() == 0)) {
                                    userSettingFragment.OooOoo();
                                }
                            } else if (C28039OooO00o.OooO0OO()) {
                                if (user.getMobile().length() == 0 && (((wxOpenID2 = user.getWxOpenID()) == null || wxOpenID2.length() == 0) && ((hwOpenID2 = user.getHwOpenID()) == null || hwOpenID2.length() == 0))) {
                                    userSettingFragment.OooOoo();
                                }
                            } else if (user.getMobile().length() == 0 && (((wxOpenID = user.getWxOpenID()) == null || wxOpenID.length() == 0) && ((hwOpenID = user.getHwOpenID()) == null || hwOpenID.length() == 0))) {
                                userSettingFragment.OooOoo();
                            }
                            String string = context.getString(R.string.un_bind_tip);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                            String string2 = context.getString(R.string.un_bind_honor_message);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                            userSettingFragment.OooOooO(string, string2, new ViewOnClickListenerC26311Ooooooo(), new ViewOnClickListenerC26311Ooooooo());
                        }
                    }
                }
                break;
        }
    }
}
