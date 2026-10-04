package com.aspose.words.net.System.Data;

import com.aspose.words.internal.zzZKN;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class ConstraintCollection implements Iterable<Constraint> {
    private final AtomicInteger zzWRS = new AtomicInteger(1);
    private final List<Constraint> zzWRT = new ArrayList();
    private final DataTable zzY61;

    public ConstraintCollection(DataTable dataTable) {
        this.zzY61 = dataTable;
    }

    private String zzXQt() {
        return "Constraint" + this.zzWRS.getAndIncrement();
    }

    private static boolean zzY(ForeignKeyConstraint foreignKeyConstraint, DataRow dataRow) {
        for (DataColumn dataColumn : foreignKeyConstraint.getColumns()) {
            Object obj = dataRow.get(dataColumn);
            if (obj != null && obj != DBNull.Value) {
                return false;
            }
        }
        return true;
    }

    private boolean zzyb(String str) {
        for (Constraint constraint : this.zzWRT) {
            if (!constraint.equals(null) && zzZKN.zzV(str, constraint.getConstraintName(), false) == 0) {
                return true;
            }
        }
        return false;
    }

    public void add(Constraint constraint) throws DataException, InvalidConstraintException {
        if (constraint == null) {
            return;
        }
        if (this == constraint.zzXQv()) {
            throw new IllegalArgumentException("Constraint already belongs to this collection.");
        }
        if (constraint.zzXQv() != null) {
            throw new IllegalArgumentException("Constraint already belongs to another collection.");
        }
        for (Constraint constraint2 : this) {
            if (constraint2.equals(constraint)) {
                throw new DataException("Constraint matches contraint named '" + constraint2.getConstraintName() + "' already in collection");
            }
        }
        if (zzyb(constraint.getConstraintName())) {
            throw new DataException("Constraint name already exists.");
        }
        constraint.addToConstraintCollectionSetup(this);
        if (constraint.getConstraintName() == null || "".equals(constraint.getConstraintName())) {
            constraint.setConstraintName(zzXQt());
        }
        constraint.zzZ(this);
        this.zzWRT.add(constraint);
        if (constraint instanceof UniqueConstraint) {
            UniqueConstraint uniqueConstraint = (UniqueConstraint) constraint;
            if (uniqueConstraint.isPrimaryKey()) {
                this.zzY61.setPrimaryKey(uniqueConstraint.getColumns());
            }
        }
    }

    public boolean contains(Constraint constraint) {
        if (constraint != null) {
            return false;
        }
        return this.zzWRT.contains(constraint);
    }

    public Constraint get(String str) {
        if (zzZKN.zzU3(str)) {
            return null;
        }
        for (Constraint constraint : this.zzWRT) {
            if (constraint.getConstraintName().equals(str)) {
                return constraint;
            }
        }
        return null;
    }

    public int getCount() {
        return this.zzWRT.size();
    }

    public final DataTable getTable() {
        return this.zzY61;
    }

    @Override // java.lang.Iterable
    public Iterator<Constraint> iterator() {
        return this.zzWRT.iterator();
    }

    public void remove(Constraint constraint) {
        if (constraint == null) {
            return;
        }
        this.zzWRT.remove(constraint);
    }

    public final List<ForeignKeyConstraint> zzXQu() {
        ArrayList arrayList = new ArrayList();
        for (Constraint constraint : this.zzWRT) {
            if (constraint instanceof ForeignKeyConstraint) {
                arrayList.add((ForeignKeyConstraint) constraint);
            }
        }
        return arrayList;
    }

    public final void zzZ(DataRow dataRow) throws ConstraintException, InvalidConstraintException {
        for (Constraint constraint : this.zzWRT) {
            if (constraint instanceof UniqueConstraint) {
                zzZ((UniqueConstraint) constraint, dataRow);
            }
            if (constraint instanceof ForeignKeyConstraint) {
                zzZ((ForeignKeyConstraint) constraint, dataRow);
            }
        }
    }

    public Constraint get(int i) {
        return this.zzWRT.get(i);
    }

    private void zzZ(UniqueConstraint uniqueConstraint, DataRow dataRow) throws ConstraintException {
        Map<String, Object> mapZzV = this.zzY61.zzXQj().zzW(uniqueConstraint.getColumns()).zzV(dataRow);
        if (mapZzV == null || mapZzV.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : mapZzV.entrySet()) {
            sb.append(zzZKN.format("Column '{0}' is constrained to be unique.  Value '{1}' is already present.", entry.getKey(), entry.getValue()));
        }
        throw new ConstraintException(sb.toString());
    }

    private void zzZ(ForeignKeyConstraint foreignKeyConstraint, DataRow dataRow) throws InvalidConstraintException {
        if (this.zzY61.getDataSet() == null || this.zzY61.getDataSet().getRelations().getCount() == 0 || foreignKeyConstraint.getRelatedTable().getTableName().equals(this.zzY61.getTableName()) || !foreignKeyConstraint.getTable().getTableName().equals(this.zzY61.getTableName()) || zzY(foreignKeyConstraint, dataRow) || zzW.zzZ(foreignKeyConstraint.getRelatedTable(), foreignKeyConstraint.getRelatedColumns(), foreignKeyConstraint.getColumns(), dataRow)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (DataColumn dataColumn : foreignKeyConstraint.getColumns()) {
            sb.append(zzZKN.format("ForeignKeyConstraint '{0}' requires the child key values ('{1}') to exist in the parent table.", foreignKeyConstraint.getConstraintName(), dataRow.get(dataColumn)));
        }
        throw new InvalidConstraintException(sb.toString());
    }
}
