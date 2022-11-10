import client from './config';

const userPath = '/user';

const ClientUsers = {
    async createUser(data) {
        try {
            console.log(data)
            const response = await client.post(`${userPath}/create`, data);
            return response;
        } catch (e) {
            return e;
        }
    },
    
    async updateUser(data) {
        try {
            const response = await client.put(`${userPath}/update`, data);
            return response;
        } catch (e) {
            return e;
        }
    },

    async deleteUser(data) {
        try {
            const response = await client.delete(`${userPath}/delete/${data.email}`);
            return response;
        } catch (e) {
            return e;
        }
    },

    async getUser(data) {
        try {
            const response = await client.get(`${userPath}/get/${data}`);
            return response;
        } catch (e) {
            return e;
        }
    },

    async getEmail(data) {
        try {
            const response = await client.get(`${userPath}/getEmail/${data.email}`);
            return response;
        } catch (e) {
            return e;
        }
    },
};

export default ClientUsers;