package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC21484OooO0oO;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.C18549R;
import com.microsoft.identity.common.logging.Logger;
import java.security.cert.X509Certificate;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class SmartcardCertPickerDialog extends SmartcardDialog {
    private static final String TAG = "SmartcardCertPickerDialog";
    private final ICancelCbaCallback mCancelCbaCallback;
    private final List<ICertDetails> mCertList;
    private final PositiveButtonListener mPositiveButtonListener;

    public static class CertDetailsAdapter extends ArrayAdapter<ICertDetails> {
        public CertDetailsAdapter(Context context, List<ICertDetails> list) {
            super(context, 0, list);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(getContext()).inflate(C18549R.layout.certificate_row_layout, viewGroup, false);
            }
            TextView textView = (TextView) view.findViewById(C18549R.id.subjectText);
            TextView textView2 = (TextView) view.findViewById(C18549R.id.issuerText);
            X509Certificate certificate = ((ICertDetails) getItem(i)).getCertificate();
            textView.setText(certificate.getSubjectDN().getName());
            textView2.setText(certificate.getIssuerDN().getName());
            ((RadioButton) view.findViewById(C18549R.id.radioButton)).setChecked(i == ((ListView) viewGroup).getCheckedItemPosition());
            return view;
        }
    }

    public interface PositiveButtonListener {
        void onClick(ICertDetails iCertDetails);
    }

    public SmartcardCertPickerDialog(List<ICertDetails> list, PositiveButtonListener positiveButtonListener, ICancelCbaCallback iCancelCbaCallback, Activity activity) {
        super(activity);
        this.mCertList = list;
        this.mPositiveButtonListener = positiveButtonListener;
        this.mCancelCbaCallback = iCancelCbaCallback;
        createDialog();
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.SmartcardDialog
    public void createDialog() {
        final String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":createDialog");
        final CertDetailsAdapter certDetailsAdapter = new CertDetailsAdapter(this.mActivity, this.mCertList);
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardCertPickerDialog.1
            @Override // java.lang.Runnable
            public void run() {
                DialogInterfaceC21484OooO0oO dialogInterfaceC21484OooO0oOCreate = new DialogInterfaceC21484OooO0oO.OooO00o(SmartcardCertPickerDialog.this.mActivity, C18549R.style.CertAlertDialogTheme).setTitle(C18549R.string.smartcard_cert_dialog_title).setSingleChoiceItems(certDetailsAdapter, 0, (DialogInterface.OnClickListener) null).setPositiveButton(C18549R.string.smartcard_cert_dialog_positive_button, new DialogInterface.OnClickListener() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardCertPickerDialog.1.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ICertDetails iCertDetails = (ICertDetails) certDetailsAdapter.getItem(((DialogInterfaceC21484OooO0oO) dialogInterface).f62437OooOo0o.f62252OooO0oO.getCheckedItemPosition());
                        if (iCertDetails != null) {
                            SmartcardCertPickerDialog.this.mPositiveButtonListener.onClick(iCertDetails);
                        } else {
                            SmartcardCertPickerDialog.this.mCancelCbaCallback.onCancel();
                            Logger.error(strOooO0OO, "Could not retrieve info for selected certificate entry.", null);
                        }
                    }
                }).setNegativeButton(C18549R.string.smartcard_cert_dialog_negative_button, new DialogInterface.OnClickListener() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardCertPickerDialog.1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        SmartcardCertPickerDialog.this.mCancelCbaCallback.onCancel();
                    }
                }).create();
                final AlertController.RecycleListView recycleListView = dialogInterfaceC21484OooO0oOCreate.f62437OooOo0o.f62252OooO0oO;
                recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardCertPickerDialog.1.3
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        recycleListView.setItemChecked(i, true);
                        certDetailsAdapter.notifyDataSetChanged();
                    }
                });
                dialogInterfaceC21484OooO0oOCreate.setCanceledOnTouchOutside(false);
                dialogInterfaceC21484OooO0oOCreate.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.SmartcardCertPickerDialog.1.4
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        SmartcardCertPickerDialog.this.mCancelCbaCallback.onCancel();
                    }
                });
                SmartcardCertPickerDialog.this.mDialog = dialogInterfaceC21484OooO0oOCreate;
            }
        });
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.SmartcardDialog
    public void onUnexpectedUnplug() {
        this.mCancelCbaCallback.onCancel();
    }
}
