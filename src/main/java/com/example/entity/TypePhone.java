package com.example.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tblTypePhone")
public class TypePhone {
    @Id
    private String typeID;
    private String typeName;

    @OneToMany(mappedBy = "typePhone",fetch = FetchType.LAZY)
    private List<Phone> phone;

    public TypePhone() {
    }

    public TypePhone(String typeID, String typeName, List<Phone> phone) {
        this.typeID = typeID;
        this.typeName = typeName;
        this.phone = phone;
    }

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }
}
