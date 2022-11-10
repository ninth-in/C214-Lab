import React from "react";
import { Routes, Route } from "react-router-dom";

import Create from '../pages/Create';
import Update from '../pages/Update';
import Delete from '../pages/Delete';
import Get from '../pages/Get';
import GetEmail from '../pages/GetEmail';

export default function Routers() {
    return (
        <Routes>
            <Route exact path="/" element={<Create />} />
            <Route exact path="/update" element={<Update />} />
            <Route exact path="/delete" element={<Delete />} />
            <Route exact path="/get" element={<Get />} />
            <Route exact path="/getEmail" element={<GetEmail />} />
        </Routes>
    )
}