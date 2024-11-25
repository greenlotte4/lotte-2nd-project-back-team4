package com.team4.lion.entity;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "drive_file")
public class DriveFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "drive_file_id")
    private Integer driveFileId;

    @ManyToOne
    @JoinColumn(name = "drive_id")
    private Drive drive;

    @ManyToOne
    @JoinColumn(name = "folder_id")
    private Folder folder;

    @ManyToOne
    @JoinColumn(name = "created_user_id")
    private User createdUser;

    @Column(name = "file_oname")
    private String fileOriginalName;

    @Column(name = "file_sname")
    private String fileStoredName;

    @Column(name = "file_size")
    private Integer fileSize;

    @Column(name = "file_type")
    private String fileType;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
