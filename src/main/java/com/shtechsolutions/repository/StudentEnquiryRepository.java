
package com.shtechsolutions.shtech.repository;

import com.shtechsolutions.shtech.entity.StudentEnquiry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentEnquiryRepository
        extends JpaRepository<StudentEnquiry, Long> {
}
